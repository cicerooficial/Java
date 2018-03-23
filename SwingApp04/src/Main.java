
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

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
        frame.setTitle(" Swing App 04 ");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        /*
        Remove o layout do painel (Somente para componentes que agrupam outros componentes)
         */
        //panel.setLayout(null);

        /*
        Cria layouts onde os mesmos podem ser incrementados um em cima do outro, alinhando paineis ou componentes maiores de forma mais organizada
         */
        panel.setLayout(new BorderLayout());
        JButton button01 = new JButton("Botão 01");
        panel.add(button01, BorderLayout.NORTH);
        JButton button02 = new JButton("Botão 02");
        panel.add(button02, BorderLayout.WEST);
        JButton button03 = new JButton("Button 03");
        panel.add(button03, BorderLayout.SOUTH);

        /*
        Cria uma organização de conforme for incrementando ele vai descendo para a linha de baixo, organizando seu inciando de posição da tela ex: sempre do centro para baixo, etc.
        panel.setLayout(FlowLayout(FlowLayout.LEFT)); 
        JButton button01 = new JButton("Botão 01");
        panel.add(button01));
        JButton button02 = new JButton("Botão 02");
        panel.add(button02);
        JButton button03 = new JButton("Button 03");
        panel.add(button03);
         */
 /*
        panel.setLayout(new GridLayout(2,0));
        JButton button01 = new JButton("Botão 01");
        panel.add(button01);
        JButton button02 = new JButton("Botão 02");
        panel.add(button02);
        JButton button03 = new JButton("Button 03");
        panel.add(button03);
         */
 /*
        JLabel label = new JLabel("Exemplo de Label");
        panel.add(label);
        JTextField field = new JTextField(10);
        panel.add(field);
        String[] opcoesCombo = {"Selecione", "Opção 01", "Opção 02", "Opção 03", "Opção 04"};
        JComboBox comboBox = new JComboBox(opcoesCombo);
        panel.add(comboBox);
         */

 /*
        Posição em relação a margem , Posição em relação ao topo, Largura, Altura
         */
        button01.setBounds(50, 25, 100, 25);
        button02.setBounds(50, 50, 100, 25);
        button03.setBounds(50, 75, 100, 25);
//        field.setBounds(200, 150, 100, 25);
//        comboBox.setBounds(50, 350, 200, 100);
//        label.setBounds(260, 520, 200, 25);

        frame.pack();
        frame.setVisible(true);

    }

}
