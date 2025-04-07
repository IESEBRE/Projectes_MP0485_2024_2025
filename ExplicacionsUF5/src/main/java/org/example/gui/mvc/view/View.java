package org.example.gui.mvc.view;

import javax.swing.*;

public class View extends JFrame {
    private JPanel panel;
    private JButton button1;

    public View(){
        setContentPane(panel);
        pack();
        setVisible(true);
    }

    //getters pel controlador

    public JButton getButton1() {
        return button1;
    }
}
