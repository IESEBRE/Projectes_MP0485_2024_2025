package org.example.gui.nomvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JPanel panel;
    private JButton botoApreta;

    //dades de l'aplicació
    private int numClics=0;

    public Main(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new Dimension(400,400));
        pack();
        setVisible(true);

        botoApreta.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                numClics++;
                JOptionPane.showMessageDialog(botoApreta,"M'has apretat "+numClics+" vegades!!");

            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }

}
