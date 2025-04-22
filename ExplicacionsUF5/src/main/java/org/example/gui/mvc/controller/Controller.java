package org.example.gui.mvc.controller;

import org.example.gui.mvc.model.Model;
import org.example.gui.mvc.view.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Controller {
    
    //propietats del controlador
    View vista;
    Model model;
    
    //Constructor
    public Controller(View vista, Model model){
        this.vista=vista;
        this.model=model;
        controla();
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
                model.setNumClics(model.getNumClics()+1);
                JOptionPane.showMessageDialog(vista.getButton1(),"M'has apretat "+model.getNumClics()+" vegades!!");
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
                    //Seleccionem el text del JTextField, així és més fàcil borrar-lo i tornar a escriure
                    vista.getTextField1().setSelectionStart(0);
                    vista.getTextField1().setSelectionEnd(text.length());
                    //Impedim la pèrdua de foco del component
                    vista.getTextField1().requestFocusInWindow();
                };
            }
        });

    }
}
