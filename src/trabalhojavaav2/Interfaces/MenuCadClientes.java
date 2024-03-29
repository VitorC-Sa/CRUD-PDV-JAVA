package trabalhojavaav2.Interfaces;

import javax.swing.JOptionPane;
import trabalhojavaav2.Classes.Cliente;
import trabalhojavaav2.OperacaoCadastro;

/**
 *
 * @author vitor
 */
public class MenuCadClientes extends javax.swing.JDialog {
    
    private OperacaoCadastro operacaoCadastro;
    private Cliente cliente;
    private boolean confirmado;
    
    public MenuCadClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public MenuCadClientes(java.awt.Frame parent, OperacaoCadastro operacaoCadastro, Cliente cliente) {
        super (parent, true);
        this.operacaoCadastro=operacaoCadastro;
        this.cliente=cliente;
        confirmado=false;
        initComponents();
        
        if (operacaoCadastro == operacaoCadastro.ocAlterar || operacaoCadastro == operacaoCadastro.ocConsultar) {
            textCodigoCli.setText(String.valueOf(cliente.obterCodigo()));
            textNomeCli.setText(cliente.obterNome());
            textCPFCli.setText(cliente.obterCpf());
            textEstadoCli.setText(cliente.obterEstado());
            textCidadeCli.setText(cliente.obterCidade());
            textBairroCli.setText(cliente.obterBairro());
            textRuaCli.setText(cliente.obterRua());
            textComplementoCli.setText(cliente.obterComplemento());
            textTelefoneCli.setText(cliente.obterTelefone());
            textEmailCli.setText(cliente.obterEmail());
        } else {
            textEstadoCli.setText("RJ");
            textCidadeCli.setText("PETROPOLIS");
        }
        buCancelarCli.setEnabled(operacaoCadastro != operacaoCadastro.ocConsultar);
        textCodigoCli.setEnabled(false);
        textNomeCli.setEnabled(operacaoCadastro != operacaoCadastro.ocConsultar);
        textCPFCli.setEnabled(operacaoCadastro != operacaoCadastro.ocConsultar);
        textEstadoCli.setEnabled(operacaoCadastro != operacaoCadastro.ocConsultar);
        textCidadeCli.setEnabled(operacaoCadastro != operacaoCadastro.ocConsultar);
        textBairroCli.setEnabled(operacaoCadastro != operacaoCadastro.ocConsultar);
        textRuaCli.setEnabled(operacaoCadastro != operacaoCadastro.ocConsultar);
        textComplementoCli.setEnabled(operacaoCadastro != operacaoCadastro.ocConsultar);
        textTelefoneCli.setEnabled(operacaoCadastro != operacaoCadastro.ocConsultar);
        textEmailCli.setEnabled(operacaoCadastro != operacaoCadastro.ocConsultar);
    }
    
    public boolean operacaoConfirmada() {
        return confirmado;
    }
    
    
    public static boolean executar(java.awt.Frame parent, OperacaoCadastro operacaoCadastro, Cliente cliente) {
        MenuCadClientes menuCadClientes = new MenuCadClientes(parent, operacaoCadastro, cliente);
        menuCadClientes.setLocationRelativeTo(null);
        menuCadClientes.setVisible(true);
        return menuCadClientes.operacaoConfirmada();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textNomeCli = new javax.swing.JTextField();
        textCPFCli = new javax.swing.JTextField();
        textEmailCli = new javax.swing.JTextField();
        textTelefoneCli = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        buOkCli = new javax.swing.JButton();
        buCancelarCli = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textComplementoCli = new javax.swing.JTextField();
        textEstadoCli = new javax.swing.JTextField();
        textCidadeCli = new javax.swing.JTextField();
        textBairroCli = new javax.swing.JTextField();
        textRuaCli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textCodigoCli = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel2.setText("*Nome:");

        jLabel3.setText("*CPF:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("*Email:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buOkCli.setText("Ok");
        buOkCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buOkCliActionPerformed(evt);
            }
        });

        buCancelarCli.setText("Cancelar");
        buCancelarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buCancelarCliActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado:");

        jLabel8.setText("Cidade:");

        jLabel9.setText("Bairro:");

        jLabel10.setText("Rua:");

        jLabel11.setText("Comple.:");

        jLabel1.setText("Código:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textComplementoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textTelefoneCli)
                        .addComponent(textEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textNomeCli)
                        .addComponent(textCPFCli)
                        .addComponent(textEstadoCli, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textCidadeCli)
                        .addComponent(textBairroCli)
                        .addComponent(textRuaCli)
                        .addComponent(textCodigoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buOkCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buCancelarCli))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(buOkCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buCancelarCli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCodigoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textCPFCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(textEstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(textCidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(textBairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(textRuaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textComplementoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buCancelarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buCancelarCliActionPerformed
        dispose();
    }//GEN-LAST:event_buCancelarCliActionPerformed

    private void buOkCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buOkCliActionPerformed
        boolean valido = true;
        try {
            if (operacaoCadastro != OperacaoCadastro.ocConsultar) {
                
                String camposInvalidos[] = new String [9];
                int index = 1;
                
                if (!textNomeCli.getText().equals("")) {
                    cliente.atualizarNome(textNomeCli.getText().toUpperCase());
                } else {
                    camposInvalidos[index++] = "Nome";
                    valido = false;
                }
                if (!textCPFCli.getText().equals("") && textCPFCli.getText().length() == 14) {
                    cliente.atualizarCpf(textCPFCli.getText().toUpperCase());
                } else {
                    camposInvalidos[index++] = "CPF";
                    valido = false;
                }
                if (!textEstadoCli.getText().equals("")) {
                    if (textEstadoCli.getText().length() == 2) {
                        cliente.atualizarEstado(textEstadoCli.getText().toUpperCase());
                    } else {
                        camposInvalidos[index++] = "Estado";
                        valido = false;
                    }
                }
                
                cliente.atualizarCidade(textCidadeCli.getText().toUpperCase());
                cliente.atualizarBairro(textBairroCli.getText().toUpperCase());
                cliente.atualizarRua(textRuaCli.getText().toUpperCase());
                cliente.atualizarComplemento(textComplementoCli.getText().toUpperCase());
                cliente.atualizarTelefone(textTelefoneCli.getText().toUpperCase());
                cliente.atualizarEmail(textEmailCli.getText().toUpperCase());
                
                if (valido) {
                    confirmado = true;
                } else {
                    camposInvalidos[0] = "Entrada(s) Invalida(s):\n\n";
                    JOptionPane.showMessageDialog(this, camposInvalidos);
                }
                
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Entrada Invalida!\n"+e);
        }
        if (valido) {
            dispose();
        }
    }//GEN-LAST:event_buOkCliActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuCadClientes dialog = new MenuCadClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buCancelarCli;
    private javax.swing.JButton buOkCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textBairroCli;
    private javax.swing.JTextField textCPFCli;
    private javax.swing.JTextField textCidadeCli;
    private javax.swing.JTextField textCodigoCli;
    private javax.swing.JTextField textComplementoCli;
    private javax.swing.JTextField textEmailCli;
    private javax.swing.JTextField textEstadoCli;
    private javax.swing.JTextField textNomeCli;
    private javax.swing.JTextField textRuaCli;
    private javax.swing.JTextField textTelefoneCli;
    // End of variables declaration//GEN-END:variables
}
