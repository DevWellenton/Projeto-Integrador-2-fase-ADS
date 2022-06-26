
package view;

public class frameMenu extends javax.swing.JFrame {

    /**
     * Creates new form frameMenu
     */
    public frameMenu() {
        initComponents();
    }
    //
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        itemPontoAvaliacaoVisualizacao = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemPontoTuristico = new javax.swing.JMenuItem();
        itemCidade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eos");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jMenu2.setText("Home");

        itemPontoAvaliacaoVisualizacao.setText("Ponto Turísticos");
        itemPontoAvaliacaoVisualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPontoAvaliacaoVisualizacaoActionPerformed(evt);
            }
        });
        jMenu2.add(itemPontoAvaliacaoVisualizacao);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Cadastro");

        itemPontoTuristico.setText("Ponto Turístico");
        itemPontoTuristico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPontoTuristicoActionPerformed(evt);
            }
        });
        jMenu1.add(itemPontoTuristico);

        itemCidade.setText("Cidade");
        itemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCidadeActionPerformed(evt);
            }
        });
        jMenu1.add(itemCidade);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemPontoTuristicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPontoTuristicoActionPerformed
        // TODO add your handling code here:
        new dialogPontoTuristico(this, true).setVisible(true);
    }//GEN-LAST:event_itemPontoTuristicoActionPerformed

    private void itemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCidadeActionPerformed
        // TODO add your handling code here:
        new dialogCidade(this, true).setVisible(true);
    }//GEN-LAST:event_itemCidadeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void itemPontoAvaliacaoVisualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPontoAvaliacaoVisualizacaoActionPerformed
        // TODO add your handling code here:
        new dialogPontoTuristicoVisualiazacao(this, true).setVisible(true);
    }//GEN-LAST:event_itemPontoAvaliacaoVisualizacaoActionPerformed


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
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMenu().setVisible(true);
                //frameMenu tela = new frameMenu(); tela.setExtendedState(JFrame.MAXIMIZED_BOTH); tela.show();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCidade;
    private javax.swing.JMenuItem itemPontoAvaliacaoVisualizacao;
    private javax.swing.JMenuItem itemPontoTuristico;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
