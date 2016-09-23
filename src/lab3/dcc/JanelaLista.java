
package lab3.dcc;

import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


class JanelaLista extends JFrame{
    
    private final JLabel lblNumero = new JLabel("Numero");
    private final JTextField txtNumero = new JTextField(10);
    private final JButton btnNumero = new JButton("+");
    private final JList<Integer> lstNumeros = new JList<>(new DefaultListModel<Integer>());

    public JanelaLista() {
        super("Lista");
        JPanel pnlEntrada = new JPanel(new BorderLayout(5, 5));
        pnlEntrada.add(lblNumero, BorderLayout.WEST);
        pnlEntrada.add(txtNumero, BorderLayout.CENTER);
        pnlEntrada.add(btnNumero, BorderLayout.EAST);
        
        add(pnlEntrada, BorderLayout.NORTH);
        add(new JScrollPane(lstNumeros), BorderLayout.CENTER);
        
        btnNumero.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<Integer> modelo = (DefaultListModel<Integer>)lstNumeros.getModel();
                try{
                         modelo.addElement(Integer.parseInt(txtNumero.getText()));   
                }

                catch (NumberFormatException ex) 
                {
                    System.out.println("Corrija!");
                }
                txtNumero.setText("");
                txtNumero.requestFocus();
            }
        });
    }
    
    
}
