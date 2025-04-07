package org.example.gui.mvc;

import org.example.gui.mvc.controller.Controller;
import org.example.gui.mvc.model.Model;
import org.example.gui.mvc.view.View;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new Controller(new View(),new Model());


            }
        });
    }


}
