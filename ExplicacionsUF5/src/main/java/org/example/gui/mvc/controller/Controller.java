package org.example.gui.mvc.controller;

import org.example.gui.mvc.model.Model;
import org.example.gui.mvc.view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        //Anem a posar el codi al clic del ratolí
        vista.getButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setNumClics(model.getNumClics()+1);
                JOptionPane.showMessageDialog(vista.getButton1(),"M'has apretat "+model.getNumClics()+" vegades!!");
            }
        });

    }
}
