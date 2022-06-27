
package view;

import controller.daoCidade;
import controller.daoPontoTuristico;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Cidade;
import model.PontoTuristico;


public class dialogPontoTuristico extends javax.swing.JDialog {

    // 1
    private daoPontoTuristico dao = new daoPontoTuristico();
    //2 Limpando Componentes antes de carregar
    private void clearComponents(){
        textCodigo.setText(""); 
        textNome.setText(""); 
        textEndereco.setText("");
        textDescricao.setText("");
        comboCidade.setSelectedIndex(0);
        textFoto.setText("");
        textNome.requestFocus();
    }
    //3 Montando Objeto para mandar para a controller
    private PontoTuristico createPontoTuristico(){
        return new PontoTuristico(textCodigo.getText().isEmpty()?0:Integer.parseInt(textCodigo.getText()),
                                    textNome.getText(),
                                    textEndereco.getText(),
                                    textDescricao.getText(),
                                    (Cidade)comboCidade.getSelectedItem(),
                                    textFoto.getText());
    }    
    //4 Atualizando os Componentes da tela
    private void fillComponents(PontoTuristico pontoTuristico){
        textCodigo.setText(pontoTuristico.getId()+"");
        textNome.setText(pontoTuristico.getNome());
        textEndereco.setText(pontoTuristico.getEndereco());
        textDescricao.setText(pontoTuristico.getDescricao());
        comboCidade.setSelectedItem(pontoTuristico.getCidade());
        textFoto.setText(pontoTuristico.getFoto());
    }
    //5
    private void loadComboCidade(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel(new daoCidade().read().toArray()); //carrega a lista de estados do enum
        comboCidade.setModel(cbm);
    }
    //6
    private void loadList(){  //LISTANDO TUDO
        DefaultListModel lm = new DefaultListModel();
        lm.addAll(dao.read());
        listPontoTuristico.setModel(lm);
    }
    
    private void loadList(String filtro){  //LISTANDO APARTIR DE UM FILTRO NOME
        DefaultListModel lm = new DefaultListModel();
        lm.addAll(dao.read(filtro));
        listPontoTuristico.setModel(lm);
    }
    

    
    
    
    
    
    public dialogPontoTuristico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        comboCidade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        textFoto = new javax.swing.JTextField();
        buttonNovo = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        textFiltro = new javax.swing.JTextField();
        buttonFiltrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listPontoTuristico = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ponto Turisístico");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Criar/Editar "));
        jPanel1.setName("Cadastrar/Editar"); // NOI18N

        jLabel1.setText("NOME");

        textNome.setText(" ");

        jLabel2.setText("ENDEREÇO");

        jLabel3.setText("DESCRIÇÃO");

        textDescricao.setColumns(20);
        textDescricao.setRows(5);
        jScrollPane1.setViewportView(textDescricao);

        jLabel4.setText("CIDADE");

        comboCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("IMAGEM");

        buttonNovo.setBackground(new java.awt.Color(0, 153, 255));
        buttonNovo.setText("Novo");
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
            }
        });

        buttonSalvar.setBackground(new java.awt.Color(0, 204, 51));
        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonRemover.setBackground(new java.awt.Color(255, 0, 0));
        buttonRemover.setText("Remover");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        jLabel9.setText("CÓDIGO");

        textCodigo.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonNovo)
                .addGap(63, 63, 63)
                .addComponent(buttonSalvar)
                .addGap(66, 66, 66)
                .addComponent(buttonRemover)
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFoto)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                            .addComponent(comboCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNovo)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonRemover))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Ponto Turístico"));
        jPanel2.setEnabled(false);
        jPanel2.setName("Lista Ponto Turístico"); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar"));

        jLabel6.setText("NOME");

        buttonFiltrar.setBackground(new java.awt.Color(0, 153, 255));
        buttonFiltrar.setText("Filtrar");
        buttonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonFiltrar)
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFiltrar)
                    .addComponent(textFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        listPontoTuristico.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        listPontoTuristico.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listPontoTuristico.setToolTipText("Selecione para editar");
        listPontoTuristico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPontoTuristicoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listPontoTuristico);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Criar/Editar Pontos Turísticos");
        jPanel2.getAccessibleContext().setAccessibleName("Listar Pontos Turísticos");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
        this.clearComponents();
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(textNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nome obrigatório");
            textNome.requestFocus();
            return;
        }
        try{
            PontoTuristico pontoTuristico = this.createPontoTuristico(); //estou pegando oque tenho na tela e criando um objeto
            if(textCodigo.getText().isEmpty()){  //testando se o registro é novo ou é um update
                dao.create(pontoTuristico);
                JOptionPane.showMessageDialog(null, "Ponto Turístico Cadastrado.");
            }else{ //uodate
                dao.update(pontoTuristico);
                JOptionPane.showMessageDialog(null, "Ponto Turístico atualizado.");
            }
            //refresh após a ação
            this.clearComponents(); // limpa os campos
            this.loadList(); //recarrego a lista
        }catch(Exception ex){

        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        if(listPontoTuristico.getSelectedIndex()== -1){
            JOptionPane.showMessageDialog(null, "Selecione o registro para remover.");
            return;
        }
        //
        if(JOptionPane.showConfirmDialog(null, "Confirma?")!=0){
            return;
        }
        try{
            PontoTuristico pontoTuristico = (PontoTuristico)listPontoTuristico.getSelectedValue(); //selecionando o objeto clicado
            dao.delete(pontoTuristico); //deletando objeto do bd
            // refresh
            this.clearComponents(); //limpando campos
            this.loadList(); //carregando lista
        }catch(Exception ex){
            System.out.println("ERRO "+ex.getMessage());
        }
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrarActionPerformed
        this.loadList(textFiltro.getText());
    }//GEN-LAST:event_buttonFiltrarActionPerformed

    private void listPontoTuristicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPontoTuristicoMouseClicked
        PontoTuristico pontoTuristico = (PontoTuristico)listPontoTuristico.getSelectedValue(); //pegando o que está selecionado no clique do mouse
        this.fillComponents(pontoTuristico);
    }//GEN-LAST:event_listPontoTuristicoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadComboCidade();
        loadList();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(dialogPontoTuristico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogPontoTuristico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogPontoTuristico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogPontoTuristico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogPontoTuristico dialog = new dialogPontoTuristico(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFiltrar;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listPontoTuristico;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextArea textDescricao;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textFiltro;
    private javax.swing.JTextField textFoto;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}
