/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosGUIBuilder;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author cicero
 */
public class Exercicio3 extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio3
     */
    public Exercicio3() {
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
        jLabelFrase = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProdutos = new javax.swing.JList<>();
        jLabelProdutos = new javax.swing.JLabel();
        jButtonComprar = new javax.swing.JButton();
        jLabelQtdPermitida = new javax.swing.JLabel();
        jLabelValorTotal = new javax.swing.JLabel();
        jComboBoxQtdPermitido = new javax.swing.JComboBox<>();
        jLabelUnidades = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelFrase.setText("Venda de Produtos");

        jListProdutos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Arroz - R$4.99", "Feijao - R$3.89", "Sal - R$2.50", "Ovos (30 unid.) - R$10.00", "Carne - R$22.98", "Peixe - R$13.75", "Biscoito - R$2.50", "Suco(2 Lts.) - R$8.69" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListProdutos);

        jLabelProdutos.setText("Produtos");

        jButtonComprar.setText("Comprar");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        jLabelQtdPermitida.setText("Quantidade permitida: 5");

        jLabelValorTotal.setText("Valor Total: R$0,00");

        jComboBoxQtdPermitido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabelUnidades.setText("Unidades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabelProdutos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxQtdPermitido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUnidades))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonComprar))
                    .addComponent(jLabelValorTotal)
                    .addComponent(jLabelFrase)
                    .addComponent(jLabelQtdPermitida))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFrase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonComprar)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelUnidades)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxQtdPermitido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabelQtdPermitida)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int qtdPermitida = 5, item, qtd;
    double valorTotal = 0, preco;

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        // TODO add your handling code here:


        /*
        0- Arroz - R$4.99
        1- Feijao - R$3.89
        2- Sal - R$2.50
        3- Ovos (30 unid.) - R$10.00
        4- Carne - R$22.98
        5- Peixe - R$13.75
        6- Biscoito - R$2.50
        7- Suco(2 Lts.) - R$8.69        
         */
        item = jListProdutos.getSelectedIndex();
        qtd = (int) 1 + jComboBoxQtdPermitido.getSelectedIndex();

        if (qtdPermitida == 0) {
            JOptionPane.showMessageDialog(null, "Quantidade permitida de produtos excedido!");
        } else {
            switch (item) {
                case 0:
                    preco = preco + (4.99 * qtd);
                    System.out.println("Arroz - R$" + preco);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    break;
                case 1:
                    preco = preco + (3.89 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Feijão- R$" + preco);
                    break;
                case 2:
                    preco = preco + (2.50 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Sal - R$" + preco);
                    break;
                case 3:
                    preco = preco + (10.00 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Ovos (30 unid.) - R$" + preco);
                    break;
                case 4:
                    preco = preco + (22.98 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Carne - R$" + preco);
                    break;
                case 5:
                    preco = preco + (13.75 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Peixe - R$" + preco);
                    break;
                case 6:
                    preco = preco + (2.50 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Biscoito - R$" + preco);
                    break;
                case 7:
                    preco = preco + (8.69 * qtd);
                    jLabelValorTotal.setText("Valor Total: R$" + preco);
                    System.out.println("Suco(2 Lts.) - R$" + preco);
                    break;
                default:
                    System.out.println("Nenhum Item Selecionado");
                    break;
            }

            jLabelQtdPermitida.setText("Quantidade permitida: " + (qtdPermitida = (qtdPermitida - 1)));
        }


    }//GEN-LAST:event_jButtonComprarActionPerformed

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
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JComboBox<String> jComboBoxQtdPermitido;
    private javax.swing.JLabel jLabelFrase;
    private javax.swing.JLabel jLabelProdutos;
    private javax.swing.JLabel jLabelQtdPermitida;
    private javax.swing.JLabel jLabelUnidades;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JList<String> jListProdutos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private int jSpinnerQuantidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}