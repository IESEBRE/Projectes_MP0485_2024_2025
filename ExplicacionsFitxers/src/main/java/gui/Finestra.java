package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Finestra extends JFrame {
    private JPanel panel;
    private JButton botoExemple;
    private JButton segonBoto;
    private JButton tercerBoto;

    public Finestra(){
        //Per poder visualitzar la finestra farem...
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        //Listeners dels diferents components de la finestra
        botoExemple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Has clicat al ratolí "+actionEvent.getSource());
            }
        });
        segonBoto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                JOptionPane.showMessageDialog(null,"Has clicat a botó 2");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Finestra();
            }
        });
    }

}
