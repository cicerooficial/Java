/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cicero;

//import javax.swing.JOptionPane;
/**
 *
 * @author cicero.hsantos
 */
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, " Sou Programador! HAHAHA ");
        Runnable r = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(r);
    }

    private static void criarGUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
       
        JLabel label1 = new JLabel("Olá Mundo! 1 ");
        
        panel.add(label1);
        panel.add(new JLabel("Olá Mundo! 2 "));
        panel.add(new JLabel("Olá Mundo! 3 "));
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

        frame.setMinimumSize(new Dimension(300, 300));
        frame.setTitle(" Vai que Vai! ");
        
        frame.setResizable(true);

    }

}
