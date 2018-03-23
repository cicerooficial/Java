/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapp02;

/**
 *
 * @author cicero.hsantos
 */
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }

    private static void criarGUI() {

        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(400, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(" Swing App 02 ");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JLabel label = new JLabel("Teste");
        panel.add(label);

        final JTextField field = new JTextField(10);
        panel.add(field);
        JButton button = new JButton("Botão");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //System.out.println(" Valor digital: " + field.getText());
                //JOptionPane.showMessageDialog(null, " Valor digitado:  " + field.getText());
                JOptionPane.showMessageDialog(panel, " Valor digitado:  " + field.getText());
                //JOptionPane.showMessageDialog(frame, " Valor digitado:  " + field.getText());
                //JOptionPane.showMessageDialog(button, " Valor digitado:  " + field.getText());
                //JOptionPane.showMessageDialog(field, " Valor digitado:  " + field.getText());
                //JOptionPane.showMessageDialog(label, " Valor digitado:  " + field.getText());
            }
        });

        JCheckBox checkBox01 = new JCheckBox("Item 01");
        panel.add(checkBox01);

        checkBox01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (checkBox01.isSelected()) {
                    JOptionPane.showMessageDialog(panel, "Selecionado");
                } else {
                    JOptionPane.showMessageDialog(panel, "Tirou por que?");
                }
            }

        });

        //button.addActionListener(listener);
        frame.pack();

        frame.setVisible(true);

    }
}
