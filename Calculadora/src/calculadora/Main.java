package calculadora;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
 * @author cicero
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
        JFrame frame = new JFrame(); //Criando uma frame
        frame.setMinimumSize(new Dimension(450, 150)); // Especificando o valor mínimo da janela
        frame.setMaximumSize(new Dimension(450, 150)); // Especificando o valor fíxo da janel
        frame.setSize(new Dimension(450, 150)); // Especificando o valor fíxo da janela
        frame.setResizable(false); //Bloqueia o redimensionamento do frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configurando para fechar a aplicação ao clicar no X
        frame.setTitle(" Calculadora "); //Título da janela

        /* 
        Inciando um painel
         */
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        /*
        Criando seleções unicas com Radio Buttons das operações
         */
        JRadioButton radioSoma = new JRadioButton("Soma");
        panel.add(radioSoma, BorderLayout.NORTH);
        radioSoma.setBounds(40, 0, 70, 25);
        JRadioButton radioSubtracao = new JRadioButton("Subtração");
        panel.add(radioSubtracao, BorderLayout.NORTH);
        radioSubtracao.setBounds(110, 0, 100, 25);
        JRadioButton radioMultiplicacao = new JRadioButton("Multiplicação");
        panel.add(radioMultiplicacao, BorderLayout.NORTH);
        radioMultiplicacao.setBounds(210, 0, 120, 25);
        JRadioButton radioDivisao = new JRadioButton("Divisão");
        panel.add(radioDivisao, BorderLayout.NORTH);
        radioDivisao.setBounds(330, 0, 70, 25);

        /* Iniciamos um grupo para que tire a seleção de um dos Radios SE selecionado outro como opção */
        ButtonGroup group = new ButtonGroup();
        group.add(radioSoma);
        group.add(radioSubtracao);
        group.add(radioMultiplicacao);
        group.add(radioDivisao);

        /*
        Criando vaixas de texto e fixando tamanho para 10 caracteres
         */
        JLabel labelValor01 = new JLabel("Valor1: ");
        panel.add(labelValor01, BorderLayout.SOUTH);
        labelValor01.setBounds(10, 25, 50, 25);
        JTextField field = new JTextField(10);
        panel.add(field, BorderLayout.SOUTH);
        field.setBounds(50, 25, 100, 25);

        JLabel labelValor02 = new JLabel("Valor2: ");
        panel.add(labelValor02, BorderLayout.SOUTH);
        labelValor02.setBounds(170, 25, 50, 25);
        JTextField field2 = new JTextField(10);
        panel.add(field2, BorderLayout.SOUTH);
        field2.setBounds(220, 25, 100, 25);

        /*
        Criando botões de Resultado, Limpar e Sair
         */
        JButton buttonResultado = new JButton("Resultado");
        panel.add(buttonResultado, BorderLayout.SOUTH);
        buttonResultado.setBounds(325, 25, 100, 25);
        JButton buttonLimpar = new JButton("Limpar");
        panel.add(buttonLimpar, BorderLayout.SOUTH);
        buttonLimpar.setBounds(120, 70, 100, 25);
        JButton buttonSair = new JButton("Sair");
        panel.add(buttonSair, BorderLayout.SOUTH);
        buttonSair.setBounds(225, 70, 100, 25);

//        JLabel teste2 = new JLabel(" ");
//        panel.add(teste2, BorderLayout.SOUTH);

        /*
        Criando funcionalidade de operações ao evento de clique do botão Resultado para realizar as operações matemáticas 
         */
        buttonResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                /*
                Instanciando variáveis apra guardar resultados
                Ob: Variavel result reservada para numeros quebrados na divisão
                 */
                double resultado;

                if (radioSoma.isSelected()) {

                    /*
                    Verifica se dentro dos campos são numeros
                     */
                    try {
                        double num1 = Double.parseDouble(field.getText());
                    } catch (NumberFormatException nnum1) {
                        JOptionPane.showMessageDialog(panel, "Digite apenas Números na caixa de texto 1", "Erro", JOptionPane.ERROR_MESSAGE);
                        field.setText(""); //Limpa a caixa de texto1
                    }
                    try {
                        double num2 = Double.parseDouble(field2.getText());
                    } catch (NumberFormatException nnum2) {
                        JOptionPane.showMessageDialog(panel, "Digite apenas Números na caixa de texto 2", "Erro", JOptionPane.ERROR_MESSAGE);
                        field2.setText(""); //Limpa a caixa de texto2
                    }

                    if (field.getText().equals("") || field2.getText().equals("")) {
                        /*
                        Verifica se os campos estão vazios
                         */
                        JOptionPane.showMessageDialog(panel, "Campo vazio! Prencha os campos para realizar a operação.", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        resultado = Double.parseDouble(field.getText());
                        resultado = resultado + Double.parseDouble(field2.getText());
                        JOptionPane.showMessageDialog(panel, "A Soma de: " + field.getText() + " + " + field2.getText() + " = : " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

                    }
                } else if (radioSubtracao.isSelected()) {
                    /*
                    Verifica se dentro dos campos são numeros
                     */
                    try {
                        double num1 = Double.parseDouble(field.getText());
                    } catch (NumberFormatException nnum1) {
                        JOptionPane.showMessageDialog(panel, "Digite apenas Números na caixa de texto 1", "Erro", JOptionPane.ERROR_MESSAGE);
                        field.setText(""); //Limpa a caixa de texto1
                    }
                    try {
                        double num2 = Double.parseDouble(field2.getText());
                    } catch (NumberFormatException nnum2) {
                        JOptionPane.showMessageDialog(panel, "Digite apenas Números na caixa de texto 2", "Erro", JOptionPane.ERROR_MESSAGE);
                        field2.setText(""); //Limpa a caixa de texto2
                    }

                    /*
                Verifica se os campos estão vazios
                     */
                    if (field.getText().equals("") || field2.getText().equals("")) {
                        JOptionPane.showMessageDialog(panel, "Campo vazio! Prencha os campos para realizar a operação.", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        resultado = Double.parseDouble(field.getText());
                        resultado = resultado - Double.parseDouble(field2.getText());
                        JOptionPane.showMessageDialog(panel, "A Subatração de: " + field.getText() + " - " + field2.getText() + " = : " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if (radioMultiplicacao.isSelected()) {
                    /*
                    Verifica se dentro dos campos são numeros
                     */
                    try {
                        double num1 = Double.parseDouble(field.getText());
                    } catch (NumberFormatException nnum1) {
                        JOptionPane.showMessageDialog(panel, "Digite apenas Números na caixa de texto 1", "Erro", JOptionPane.ERROR_MESSAGE);
                        field.setText(""); //Limpa a caixa de texto1
                    }
                    try {
                        double num2 = Double.parseDouble(field2.getText());
                    } catch (NumberFormatException nnum2) {
                        JOptionPane.showMessageDialog(panel, "Digite apenas Números na caixa de texto 2", "Erro", JOptionPane.ERROR_MESSAGE);
                        field2.setText(""); //Limpa a caixa de texto2
                    }

                    /*
                Verifica se os campos estão vazios
                     */
                    if (field.getText().equals("") || field2.getText().equals("")) {
                        JOptionPane.showMessageDialog(panel, "Campo vazio! Prencha os campos para realizar a operação.", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        resultado = Double.parseDouble(field.getText());
                        resultado = resultado * Double.parseDouble(field2.getText());
                        JOptionPane.showMessageDialog(panel, "A Multiplicaçaõ de: " + field.getText() + " X " + field2.getText() + " = : " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if (radioDivisao.isSelected()) {
                    /*
                    Verifica se dentro dos campos são numeros
                     */
                    try {
                        double num1 = Double.parseDouble(field.getText());
                    } catch (NumberFormatException nnum1) {
                        JOptionPane.showMessageDialog(panel, "Digite apenas Números na caixa de texto 1", "Erro", JOptionPane.ERROR_MESSAGE);
                        field.setText(""); //Limpa a caixa de texto1
                    } catch (ArithmeticException ex) {
                        JOptionPane.showMessageDialog(panel, "Erro ao dividir po zero favor selecionar outros valores!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    try {
                        double num2 = Double.parseDouble(field2.getText());
                    } catch (NumberFormatException nnum2) {
                        JOptionPane.showMessageDialog(panel, "Digite apenas Números na caixa de texto 2", "Erro", JOptionPane.ERROR_MESSAGE);
                        field2.setText(""); //Limpa a caixa de texto2
                    }

                    try {
                        double resultado1;
                        double resultado2;
                        resultado1 = Double.parseDouble(field.getText());
                        resultado2 = Double.parseDouble(field2.getText());

                        if (resultado1 == 0 && resultado2 == 0) {
                            JOptionPane.showMessageDialog(panel, "Erro ao dividir po zero favor selecionar outros valores!", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                        field.setText("");
                        field2.setText("");

                    } catch (ArithmeticException ex) {
                        JOptionPane.showMessageDialog(panel, "Erro ao dividir po zero favor selecionar outros valores!", "Erro", JOptionPane.ERROR_MESSAGE);
                        field.setText("");
                        field2.setText("");
                    }

                    /*
                Verifica se os campos estão vazios
                     */
                    if (field.getText().equals("") || field2.getText().equals("")) {
                        JOptionPane.showMessageDialog(panel, "Campo vazio! Prencha os campos para realizar a operação.", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        resultado = Double.parseDouble(field.getText());
                        resultado = resultado / Double.parseDouble(field2.getText());
                        JOptionPane.showMessageDialog(panel, "A Divisão de: " + field.getText() + " % " + field2.getText() + " = : " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(panel, "Escolha uma operação matemática", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        );

        /*
        Criando funcionalidade de limpar caixa de texto e os campos de radios ao evento de clique do botão Limpar
         */
        buttonLimpar.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                group.clearSelection();
                field.setText(""); //Limpa a caixa de texto1
                field2.setText(""); //Limpa a caixa de texto2
            }
        }
        );

        /*
        Criando funcionalidade de sair ao evento de clique do botão Sair
         */
        buttonSair.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                /*
                Fechar a janela ao clicar no botão                
                 */
                frame.dispose();
            }
        }
        );

        frame.setSize(new Dimension(450, 150)); // Especificando o valor fíxo da janela
        frame.pack(); //Habilitar fechar pelo botão do X da tela
        frame.setVisible(true); //Configura o frame para ser visualizado

    }

}
