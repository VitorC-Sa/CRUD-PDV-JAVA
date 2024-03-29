package trabalhojavaav2.Interfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import trabalhojavaav2.BancoDeDados.FormaPagamentoBD;
import trabalhojavaav2.Classes.FormaPagamento;
import trabalhojavaav2.ModelosTabela.ModeloTabelaFormaPag;
import trabalhojavaav2.OperacaoCadastro;

/**
 *
 * @author vitor
 */
public class MenuFormasPag extends javax.swing.JDialog {

    private FormaPagamentoBD formaPagamentoBD;
    private ModeloTabelaFormaPag modeloFormaPag;
    
    public MenuFormasPag(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        formaPagamentoBD = new FormaPagamentoBD();
        modeloFormaPag = new ModeloTabelaFormaPag(new ArrayList<FormaPagamento>());
        tabFormasPag.setModel(modeloFormaPag);
        atualizarModelo();
    }
    
    private void atualizarModelo() {
        try {
            ArrayList <FormaPagamento> formasPag = new ArrayList<FormaPagamento>() ;
            formasPag = formaPagamentoBD.lerFormasPagamento();
            for (int i = 0; i < formasPag.size(); i++) {
                FormaPagamento formaPag = formasPag.get(i);
                modeloFormaPag.incluirFormaPagamento(formaPag);
            }
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
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
        jSeparator1 = new javax.swing.JSeparator();
        buCadastrarFormaPag = new javax.swing.JButton();
        buAlterarFormaPag = new javax.swing.JButton();
        buExcluirFormaPag = new javax.swing.JButton();
        buVoltarFormaPag = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabFormasPag = new javax.swing.JTable();
        buSelecionarFormaPag = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Formas de Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buCadastrarFormaPag.setText("Inserir");
        buCadastrarFormaPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buCadastrarFormaPagActionPerformed(evt);
            }
        });

        buAlterarFormaPag.setText("Alterar");
        buAlterarFormaPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buAlterarFormaPagActionPerformed(evt);
            }
        });

        buExcluirFormaPag.setText("Excluir");
        buExcluirFormaPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buExcluirFormaPagActionPerformed(evt);
            }
        });

        buVoltarFormaPag.setText("Voltar");
        buVoltarFormaPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buVoltarFormaPagActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(tabFormasPag);

        buSelecionarFormaPag.setText("Consultar");
        buSelecionarFormaPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSelecionarFormaPagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buExcluirFormaPag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buAlterarFormaPag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buCadastrarFormaPag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buVoltarFormaPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buSelecionarFormaPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buCadastrarFormaPag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buAlterarFormaPag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buExcluirFormaPag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buSelecionarFormaPag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buVoltarFormaPag)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buCadastrarFormaPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buCadastrarFormaPagActionPerformed
        FormaPagamento formaPag = new FormaPagamento();
        if (MenuCadFormasPag.executar(null, OperacaoCadastro.ocIncluir, formaPag)) {
            modeloFormaPag.incluirFormaPagamento(formaPagamentoBD.inserirFormaPagamento(formaPag));
        }
    }//GEN-LAST:event_buCadastrarFormaPagActionPerformed

    private void buAlterarFormaPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buAlterarFormaPagActionPerformed
        int indice = tabFormasPag.getSelectedRow();
        if (indice >= 0) {
            FormaPagamento formaPag = modeloFormaPag.obterFormaPagamento(indice);
            if (MenuCadFormasPag.executar(null, OperacaoCadastro.ocAlterar, formaPag)) {
                formaPagamentoBD.alterarFormaPagamento(formaPag);
                modeloFormaPag.atualizarFormaPagamento(indice, formaPag);
            }
        }
    }//GEN-LAST:event_buAlterarFormaPagActionPerformed

    private void buExcluirFormaPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buExcluirFormaPagActionPerformed
        int indice = tabFormasPag.getSelectedRow();
        if (indice >= 0) {
            FormaPagamento formaPag = modeloFormaPag.obterFormaPagamento(indice);
            int opcao = JOptionPane.showConfirmDialog(this, "Confirmar Exclusao de:  "+formaPag.obterNome(), "Exclusao", 
                                                      JOptionPane.YES_NO_OPTION);
            if (opcao == 0) {
                formaPagamentoBD.excluirFormaPag(formaPag);
                modeloFormaPag.excluirFormaPagamento(indice);
            }
        }
    }//GEN-LAST:event_buExcluirFormaPagActionPerformed

    private void buVoltarFormaPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buVoltarFormaPagActionPerformed
        dispose();
    }//GEN-LAST:event_buVoltarFormaPagActionPerformed

    private void buSelecionarFormaPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buSelecionarFormaPagActionPerformed
        int indice = tabFormasPag.getSelectedRow();
        if (indice >= 0) {
            FormaPagamento formaPag = modeloFormaPag.obterFormaPagamento(indice);
            MenuCadFormasPag.executar(null, OperacaoCadastro.ocConsultar, formaPag);
        }
    }//GEN-LAST:event_buSelecionarFormaPagActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFormasPag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFormasPag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFormasPag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFormasPag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuFormasPag dialog = new MenuFormasPag(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buAlterarFormaPag;
    private javax.swing.JButton buCadastrarFormaPag;
    private javax.swing.JButton buExcluirFormaPag;
    private javax.swing.JButton buSelecionarFormaPag;
    private javax.swing.JButton buVoltarFormaPag;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabFormasPag;
    // End of variables declaration//GEN-END:variables
}
