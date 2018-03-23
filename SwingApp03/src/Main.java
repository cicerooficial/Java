
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cicero.hsantos
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(thread);
    }

    public static void criarGUI() {
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(400, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(" Swing App 03 ");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JLabel label = new JLabel("Teste");
        panel.add(label);

        JTextField field = new JTextField(10);
        panel.add(field);

        JButton button = new JButton("Botão");
        panel.add(button);

        JCheckBox checkBox01 = new JCheckBox("Item 01");
        panel.add(checkBox01);

//        checkBox01.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                //System.out.println("Clicou no botão!");
//                if (checkBox01.isSelected()) {
//                    JOptionPane.showMessageDialog(panel, "Você selecionou!");
//                }else{
//                    JOptionPane.showMessageDialog(panel, "Você deselecionou!");
//                }
//
//            }
//        });
        /*Usamos verificar o status/evento do checkBox no momento do click (Não sendo 
        comum ficar fixo a seleção. Deve-se fazer um tratamento por fora) */
        
        checkBox01.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {

                if (ie.getStateChange() == ItemEvent.SELECTED) {
                    JOptionPane.showMessageDialog(panel, "Você selecionou!");
                }

            }
        });

        //Criando seleções unicas com Radio Buttons
        JRadioButton radio01 = new JRadioButton("Opção 01");
        panel.add(radio01);
        JRadioButton radio02 = new JRadioButton("Opção 02");
        panel.add(radio02);

        //Iniciamos um grupo para que tire a seleção de um dos Radios SE selecionado outro como opção
        ButtonGroup group = new ButtonGroup();
        group.add(radio01);
        group.add(radio02);

        //Criando uma lista para combo Box através d eum Array pré configuruada
        String[] opcoesCombo = {"Selecione", "Opção 01", "Opção 02", "Opção 03", "Opção 04"};

        JComboBox comboBox = new JComboBox(opcoesCombo);

        panel.add(comboBox);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //System.out.println("Clicou no botão!");
                //JOptionPane.showMessageDialog(panel, "Você digitou: " + field.getText());
                JOptionPane.showMessageDialog(panel, "Opção 01: " + radio01.isSelected() + "\n "
                        + "Opção02: " + radio02.isSelected() + "\n Opção 02: " + comboBox.getSelectedItem());
            }
        });

        frame.pack();

        frame.setVisible(true);

    }

}
