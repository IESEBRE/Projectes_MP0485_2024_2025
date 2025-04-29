package org.example.gui.mvc.controller;

import org.example.gui.mvc.model.Model;
import org.example.gui.mvc.view.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Controller implements PropertyChangeListener {
    
    //propietats del controlador
    View vista;
    Model model;

    //Propietat lligada
    private static final String PROP_EXCEPCIO="excepcio";   //El text ha de coincidir en el nom de la propietat lligada
    private LaMeuaExcepcio excepcio;                        //Propietat lligada

    public void setExcepcio(LaMeuaExcepcio excepcio) {
        LaMeuaExcepcio oldValue=this.excepcio;      //Guardem el valor actual de la propietat
        this.excepcio = excepcio;
        soport.firePropertyChange(PROP_EXCEPCIO,oldValue,excepcio); //Mètode que dispara el canvi de valor de la propietat
    }

    //Per poder lligar propietats necessitem una d'este tipo
    private PropertyChangeSupport soport=new PropertyChangeSupport(this);

    //Constructor
    public Controller(View vista, Model model){
        this.vista=vista;
        this.model=model;
        controla();
        //Per què tot això funcione hem de posar esta instrucció
        soport.addPropertyChangeListener(this);
    }

    //Lògica de l'aplicació
    private void controla() {

        //Propietats de la vista
        vista.setPreferredSize(new Dimension(600,600));
        vista.setContentPane(vista.getPanel());
        vista.setLocationByPlatform(true);
        vista.pack();
        vista.setVisible(true);

        //Anem a posar el codi al clic del ratolí
        vista.getButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setExcepcio(new LaMeuaExcepcio(3,"m,.m,.m.,-m.m"));
            }
        });

        //Codi de la pèrdua de foco del camp de text
        vista.getTextField1().addFocusListener(new FocusAdapter() {
            /**
             * Invoked when a component loses the keyboard focus.
             *
             * @param e
             */
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                //Text escrit al component JTextField
                String text=vista.getTextField1().getText();
                //Mirem si el text complix un patró (comença per lletra majúscyula i està seguit d'1 o més majúscules)
                if(!text.matches("\\p{Upper}[\\p{Lower}]+")) {
                    setExcepcio(new LaMeuaExcepcio(1,"El text introduit ha de començar en majúscula seguit de 1 o més minúscules"));
                };
            }
        });

    }

    /**
     * This method gets called when a bound property is changed.
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        LaMeuaExcepcio ex=(LaMeuaExcepcio) evt.getNewValue();   //Obtenim l'excepció generada fent un càsting

        //Tractament centralizat de les excepcions del programa
        switch(evt.getPropertyName()){
            case PROP_EXCEPCIO:
                if(ex.getCodi()==1) {
                    JOptionPane.showMessageDialog(null, ex.getMissatge());
                    //Seleccionem el text del JTextField, així és més fàcil borrar-lo i tornar a escriure
                    vista.getTextField1().setSelectionStart(0);
                    vista.getTextField1().setSelectionEnd(vista.getTextField1().getText().length());
                    //Impedim la pèrdua de foco del component
                    vista.getTextField1().requestFocusInWindow();
                }if(ex.getCodi()==2){
                    model.setNumClics(model.getNumClics()+1);
                    JOptionPane.showMessageDialog(vista.getButton1(),"M'has apretat "+model.getNumClics()+" vegades!!");
                }
                else  JOptionPane.showMessageDialog(null, "No sé com arreglar el que ha passat...");
                break;
            case "BONDIA":
                break;



        }
    }
}

class LaMeuaExcepcio extends Exception{
    private int codi;
    private String missatge;

    public LaMeuaExcepcio(int codi, String missatge){
        this.codi=codi;
        this.missatge=missatge;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getMissatge() {
        return missatge;
    }

    public void setMissatge(String missatge) {
        this.missatge = missatge;
    }
}