/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosGUIBuilder;

import java.security.SecureRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author cicero
 */
public class Exercicio5 extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio5
     */
    public Exercicio5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelJogador = new javax.swing.JLabel();
        jLabelCPU = new javax.swing.JLabel();
        jButtonPapel = new javax.swing.JButton();
        jLabelRodada = new javax.swing.JLabel();
        jButtonPedra = new javax.swing.JButton();
        jButtonTesoura = new javax.swing.JButton();
        jLabelEmpate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelJogador.setText("JOGADOR");

        jLabelCPU.setText("CPU");

        jButtonPapel.setText("Papel");
        jButtonPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPapelActionPerformed(evt);
            }
        });

        jLabelRodada.setText("Rodada");

        jButtonPedra.setText("Pedra");
        jButtonPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedraActionPerformed(evt);
            }
        });

        jButtonTesoura.setText("Tesoura");
        jButtonTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTesouraActionPerformed(evt);
            }
        });

        jLabelEmpate.setText("EMPATE");

        jLabel1.setText("Esolha Pedra,  Papel ou Tesoura para jogar !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonTesoura)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonPapel)
                                    .addComponent(jButtonPedra))
                                .addGap(13, 13, 13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmpate)
                            .addComponent(jLabelJogador)
                            .addComponent(jLabelRodada)
                            .addComponent(jLabelCPU))
                        .addGap(65, 65, 65))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonPedra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPapel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTesoura))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelRodada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelJogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEmpate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Cria variaiveis para ser usadas nas opções dos jogadores
     */
    String papel, pedra, tesoura;
    int rodada = 0, pontosjog = 0, pontoscpu = 0, empate = 0;

    /*
instanciando um objeto SecureRandom para geração de numeros aleatórios        
     */
    SecureRandom randomNumbers = new SecureRandom();

    private void jButtonPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPapelActionPerformed
        // TODO add your handling code here:

        /*
        **********************************************************************************
        * iniciando uma variável apra guardar as aleatoriedades geradas pelo jogador CPU *
        * Papel = 1                                                                      *
        * Pedra = 2                                                                      *
        * Tesoura = 3                                                                    *
        **********************************************************************************        
         */
        int jogadaCPU = 1 + randomNumbers.nextInt(3);

        //Papel vs Tesoura
        switch (jogadaCPU) {
            case 3:
                JOptionPane.showMessageDialog(null, "CPU VENCEU! ! \n"
                        + "************************************" + "\n"
                        + "Jogador = Papel  CPU = Tesoura \n"
                        + "************************************ \n ");
                rodada = rodada + 1;
                pontoscpu = pontoscpu + 1;

                jLabelRodada.setText("Rodada: " + rodada);
                jLabelCPU.setText("CPU: " + pontoscpu);

                //Papel vs Pedra
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "JOGADOR VENCEU! ! \n"
                        + "************************************" + "\n"
                        + "Jogador = Papel  CPU = Pedra \n"
                        + "************************************ \n ");
                rodada = rodada + 1;
                pontosjog = pontosjog + 1;

                jLabelRodada.setText("Rodada: " + rodada);
                jLabelJogador.setText("JOGADOR: " + pontosjog);
                break;
            default:
                JOptionPane.showMessageDialog(null, "EMPATE! ! \n"
                        + "************************************" + "\n"
                        + "Jogador = Papel  CPU = Papel \n"
                        + "************************************ \n ");
                rodada = rodada + 1;
                empate = empate + 1;
                jLabelRodada.setText("Rodada: " + rodada);
                jLabelEmpate.setText("EMPATE: " + empate);

                break;
        }

    }//GEN-LAST:event_jButtonPapelActionPerformed

    private void jButtonPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedraActionPerformed
        // TODO add your handling code here:

        /*
        **********************************************************************************
        * iniciando uma variável apra guardar as aleatoriedades geradas pelo jogador CPU *
        * Papel = 1                                                                      *
        * Pedra = 2                                                                      *
        * Tesoura = 3                                                                    *
        **********************************************************************************        
         */
        int jogadaCPU = 1 + randomNumbers.nextInt(3);

        //Papel vs Tesoura
        switch (jogadaCPU) {
            case 3:
                JOptionPane.showMessageDialog(null, "JOGADOR VENCEU! ! \n"
                        + "************************************" + "\n"
                        + "Jogador = Pedra  CPU = Tesoura \n"
                        + "************************************ \n ");
                rodada = rodada + 1;
                pontosjog = pontosjog + 1;

                jLabelRodada.setText("Rodada: " + rodada);
                jLabelJogador.setText("JOGADOR: " + pontosjog);

                //Papel vs Pedra
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "CPU VENCEU! ! \n"
                        + "************************************" + "\n"
                        + "Jogador = Pedra  CPU = Papel \n"
                        + "************************************ \n ");
                rodada = rodada + 1;
                pontoscpu = pontoscpu + 1;

                jLabelRodada.setText("Rodada: " + rodada);
                jLabelCPU.setText("CPU: " + pontoscpu);
                break;
            default:
                JOptionPane.showMessageDialog(null, "EMPATE! ! \n"
                        + "************************************" + "\n"
                        + "Jogador = Pedra  CPU = Pedra \n"
                        + "************************************ \n ");
                rodada = rodada + 1;
                empate = empate + 1;
                jLabelRodada.setText("Rodada: " + rodada);
                jLabelEmpate.setText("EMPATE: " + empate);

                break;
        }

    }//GEN-LAST:event_jButtonPedraActionPerformed

    private void jButtonTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTesouraActionPerformed
        // TODO add your handling code here:

        /*
        **********************************************************************************
        * iniciando uma variável apra guardar as aleatoriedades geradas pelo jogador CPU *
        * Papel = 1                                                                      *
        * Pedra = 2                                                                      *
        * Tesoura = 3                                                                    *
        **********************************************************************************        
         */
        int jogadaCPU = 1 + randomNumbers.nextInt(3);

        //Papel vs Tesoura
        switch (jogadaCPU) {
            case 1:
                JOptionPane.showMessageDialog(null, "JOGADOR VENCEU! ! \n"
                        + "************************************" + "\n"
                        + "Jogador = Tesoura  CPU = Papel \n"
                        + "************************************ \n ");
                rodada = rodada + 1;
                pontosjog = pontosjog + 1;

                jLabelRodada.setText("Rodada: " + rodada);
                jLabelJogador.setText("JOGADOR: " + pontosjog);

                //Papel vs Pedra
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "CPU VENCEU! ! \n"
                        + "************************************" + "\n"
                        + "Jogador = Tesoura  CPU = Pedra \n"
                        + "************************************ \n ");
                rodada = rodada + 1;
                pontoscpu = pontoscpu + 1;

                jLabelRodada.setText("Rodada: " + rodada);
                jLabelCPU.setText("CPU: " + pontoscpu);
                break;
            default:
                JOptionPane.showMessageDialog(null, "EMPATE! ! \n"
                        + "************************************" + "\n"
                        + "Jogador = Tesoura  CPU = Tesoura \n"
                        + "************************************ \n ");
                rodada = rodada + 1;
                empate = empate + 1;
                jLabelRodada.setText("Rodada: " + rodada);
                jLabelEmpate.setText("EMPATE: " + empate);

                break;
        }

    }//GEN-LAST:event_jButtonTesouraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPapel;
    private javax.swing.JButton jButtonPedra;
    private javax.swing.JButton jButtonTesoura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCPU;
    private javax.swing.JLabel jLabelEmpate;
    private javax.swing.JLabel jLabelJogador;
    private javax.swing.JLabel jLabelRodada;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
