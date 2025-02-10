package gui;

import com.iesebre.usefulcode.DirectAccessFile;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Finestra extends JFrame {
    private JPanel panel;
    private JButton botoInsertar;
    private JButton botoBorrar;
    private JButton botoModificar;
    private JTextField campNom;
    private JTextField campCognoms;
    private JTable taula;
    //Model de dades de la taula
    private DefaultTableModel dtm;

    //Fitxer d'accés directe
    private DirectAccessFile<Pojo> daf;

    public Finestra(){
        //Per poder visualitzar la finestra farem...
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        //Anem a establir el model de dades de la taula
        dtm=new DefaultTableModel(
                //Dades a mostrar
                new Object[][]{},
                //Definim les columnes de la taula
                new Object[]{"Nom","Cognoms"}
        );

        //Li assignem el model a la taula
        taula.setModel(dtm);

        //Poso el model de selecció de la taula de manera que només pugue seleccionar una fila
        taula.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Listeners dels diferents components de la finestra
        botoInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!campNom.getText().isBlank() || !campCognoms.getText().isBlank()){
                    dtm.addRow(new Object[]{campNom.getText().strip(),campCognoms.getText().strip()});
                }else JOptionPane.showMessageDialog((Component)actionEvent.getSource(),"No pots insertar un tetx en blanc!!");
            }
        });
        botoBorrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //Creem una variable per guardar la fila a borrar, que serà la que tenim seleccionada
                int filaSel=taula.getSelectedRow();
                if(filaSel!=-1) //Si es cumplix la condició vol dir que hem seleccionat una fila
                    dtm.removeRow(filaSel);
                else JOptionPane.showMessageDialog(e.getComponent(),"Has de seleccionar a la taula la fila que vols borrar!!");
            }
        });
        botoModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Creem una variable per guardar la fila a borrar, que serà la que tenim seleccionada
                int filaSel=taula.getSelectedRow();
                if(filaSel!=-1) { //Si es cumplix la condició vol dir que hem seleccionat una fila
                    dtm.removeRow(filaSel);     //primer borrem la fila seleccionada
                    dtm.insertRow(filaSel, new Object[]{campNom.getText().strip(),campCognoms.getText().strip()});
                    campNom.setText("");
                    campCognoms.setText("");
                }
                else JOptionPane.showMessageDialog((Component)actionEvent.getSource(),"Has de seleccionar a la taula la fila que vols modificar!!");
            }
        });
        taula.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //Copio el contingut de la fila seleccionada als corresponents camps del formulari
                int filaSel=taula.getSelectedRow();
                if(filaSel!=-1) { //Si es cumplix la condició vol dir que hem seleccionat una fila
                    campNom.setText(taula.getValueAt(filaSel,0).toString());
                    campCognoms.setText(taula.getValueAt(filaSel,1).toString());
                }else{       //Hem deseleccionat
                    campNom.setText("");
                    campCognoms.setText("");
                }
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
