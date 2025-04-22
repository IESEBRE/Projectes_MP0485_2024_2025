package org.example.gui.mvc.view;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class View extends JFrame {
    private JPanel panel;
    private JButton button1;
    private JTextField textField1;

    public View(){

    }

    //getters pel controlador


    public JPanel getPanel() {
        return panel;
    }

    public JButton getButton1() {
        return button1;
    }

    public JTextField getTextField1() {
        return textField1;
    }
}
