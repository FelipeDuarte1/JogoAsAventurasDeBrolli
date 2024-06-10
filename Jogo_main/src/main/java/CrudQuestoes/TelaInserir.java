/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CrudQuestoes;

import javax.swing.JOptionPane;
import telaInicial.EfeitoSonoro;
/**
 *
 * @author felip
 */
public class TelaInserir extends javax.swing.JFrame {

    /**
     * Creates new form TelaInserir
     */
    public TelaInserir() {
        initComponents();
        setLocationRelativeTo(null);
        txtA.setOpaque(false);
        txtB.setOpaque(false);
        txtC.setOpaque(false);
        txtD.setOpaque(false);
        txtCorreta.setOpaque(false);
        txtExplicacao.setOpaque(false);
        txtPergunta.setOpaque(false);
       
    }

    public void limparcampos(){
        txtA.setText("");
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtD.setText("");
        txtCorreta.setText("");
        txtExplicacao.setText("");
        txtPergunta.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        faseComboBox = new javax.swing.JComboBox<>();
        dificuldadeComboBox = new javax.swing.JComboBox<>();
        tituloFase = new javax.swing.JLabel();
        tituloDificuldade = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPergunta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtCorreta = new javax.swing.JTextField();
        loginTitulo = new javax.swing.JLabel();
        voltarBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BotSalvar = new javax.swing.JButton();
        BotLimpar = new javax.swing.JButton();
        txtExplicacao = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        faseComboBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        faseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boca", "Faringe", "Esofago", "Estomago","Figado","Vesicula biliar","Pancreas","Intestino delgado","Intestino grosso","Reto"}));
        getContentPane().add(faseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 110, -1));

        dificuldadeComboBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dificuldadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Médio", "Difícil",}));
        getContentPane().add(dificuldadeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 100, -1));

        tituloFase.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        tituloFase.setForeground(new java.awt.Color(255, 255, 255));
        tituloFase.setText("Fase:");
        getContentPane().add(tituloFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 37, -1));

        tituloDificuldade.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        tituloDificuldade.setForeground(new java.awt.Color(255, 255, 255));
        tituloDificuldade.setText("Dificuldade:");
        getContentPane().add(tituloDificuldade, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pergunta:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Opção A:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Opção B:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 74, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Opção C:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 74, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Opção D:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 74, -1));

        txtPergunta.setBackground(new java.awt.Color(0,0,0,1));
        txtPergunta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPergunta.setForeground(new java.awt.Color(255, 255, 255));
        txtPergunta.setToolTipText("Digite a pergunta");
        txtPergunta.setBorder(null);
        txtPergunta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPergunta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPerguntaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPerguntaFocusLost(evt);
            }
        });
        txtPergunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPerguntaMouseClicked(evt);
            }
        });
        txtPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerguntaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 780, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 780, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 780, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 780, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 730, 20));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 780, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 780, 10));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 780, 10));

        txtCorreta.setBackground(new java.awt.Color(0,0,0,1));
        txtCorreta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCorreta.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreta.setBorder(null);
        txtCorreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorretaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 780, 20));

        loginTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        loginTitulo.setForeground(new java.awt.Color(255, 255, 255));
        loginTitulo.setText("CRIAR QUESTÃO");
        getContentPane().add(loginTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        voltarBotao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        voltarBotao.setForeground(new java.awt.Color(255, 255, 255));
        voltarBotao.setText("< Voltar");
        voltarBotao.setBorder(null);
        voltarBotao.setContentAreaFilled(false);
        voltarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(voltarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Correta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 80, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Resposta ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Explicação:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 80, -1));

        BotSalvar.setBackground(new java.awt.Color(6, 16, 6));
        BotSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotSalvar.setForeground(new java.awt.Color(255, 255, 255));
        BotSalvar.setText("Criar");
        BotSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BotSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(BotSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 90, 30));

        BotLimpar.setBackground(new java.awt.Color(6, 16, 6));
        BotLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotLimpar.setForeground(new java.awt.Color(255, 255, 255));
        BotLimpar.setText("Limpar");
        BotLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BotLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotLimparActionPerformed(evt);
            }
        });
        getContentPane().add(BotLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 90, 30));

        txtExplicacao.setBackground(new java.awt.Color(0,0,0,1));
        txtExplicacao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtExplicacao.setForeground(new java.awt.Color(255, 255, 255));
        txtExplicacao.setBorder(null);
        txtExplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtExplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 730, -1));

        txtD.setBackground(new java.awt.Color(0,0,0,1));
        txtD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtD.setForeground(new java.awt.Color(255, 255, 255));
        txtD.setBorder(null);
        txtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDActionPerformed(evt);
            }
        });
        getContentPane().add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 780, 20));

        txtB.setBackground(new java.awt.Color(0,0,0,1));
        txtB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtB.setForeground(new java.awt.Color(255, 255, 255));
        txtB.setToolTipText("Digite a alternativa B");
        txtB.setBorder(null);
        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });
        getContentPane().add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 780, 20));

        txtC.setBackground(new java.awt.Color(0,0,0,1));
        txtC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtC.setForeground(new java.awt.Color(255, 255, 255));
        txtC.setBorder(null);
        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });
        getContentPane().add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 780, 20));

        txtA.setBackground(new java.awt.Color(0,0,0,1));
        txtA.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtA.setForeground(new java.awt.Color(255, 255, 255));
        txtA.setToolTipText("Digite a alternativa A");
        txtA.setBorder(null);
        txtA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAFocusLost(evt);
            }
        });
        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });
        getContentPane().add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 780, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/adm2.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -1, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSalvarActionPerformed
        EfeitoSonoro.Play("click.wav");
        boolean validacao = true;
        String fase = (String)faseComboBox.getSelectedItem();
        String dificuldade = (String)dificuldadeComboBox.getSelectedItem();
        String pergunta = txtA.getText();
        String resposta1 = txtA.getText();
        String resposta2 = txtB.getText();
        String resposta3 = txtC.getText();
        String resposta4 = txtD.getText();
        String respostaCorreta = txtCorreta.getText();
        String correcao = txtExplicacao.getText();
        
        // Verificar se algum campo está vazio
        if (fase.isEmpty() || dificuldade.isEmpty() || pergunta.isEmpty() || resposta1.isEmpty() ||
            resposta2.isEmpty() || resposta3.isEmpty() || resposta4.isEmpty() || respostaCorreta.isEmpty() || correcao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos antes de salvar a questão.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return;
        }
 
        try {
            Questoes q = new Questoes(fase,dificuldade,pergunta,resposta1,resposta2,resposta3,resposta4,respostaCorreta,correcao);
            validacao = false;
            
            QuestoesService.insert(q);
            
            JOptionPane.showMessageDialog(this, "A questão foi salva com sucesso!", "Questão Criada", JOptionPane.INFORMATION_MESSAGE);
            
            this.limparcampos();

        }
        catch (Exception e)
        {
            String title = validacao ? "Validação" : "Erro";
            int pane = validacao ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;

            JOptionPane.showMessageDialog(this, e.getMessage(), title, pane);
        }
    }//GEN-LAST:event_BotSalvarActionPerformed

    private void BotLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotLimparActionPerformed
        EfeitoSonoro.Play("back.wav");
        limparcampos();
    }//GEN-LAST:event_BotLimparActionPerformed

    private void txtPerguntaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPerguntaFocusGained
       
    }//GEN-LAST:event_txtPerguntaFocusGained

    private void txtPerguntaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPerguntaFocusLost
       
    }//GEN-LAST:event_txtPerguntaFocusLost

    private void txtPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerguntaActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtPerguntaActionPerformed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtAActionPerformed

    private void txtAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAFocusLost
        
    }//GEN-LAST:event_txtAFocusLost

    private void txtAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAFocusGained
        
    }//GEN-LAST:event_txtAFocusGained

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        EfeitoSonoro.Play("back.wav");
        MenuQuestions mq = new MenuQuestions();
        mq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarBotaoActionPerformed

    private void txtPerguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPerguntaMouseClicked
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtPerguntaMouseClicked

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtBActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtCActionPerformed

    private void txtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtDActionPerformed

    private void txtCorretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorretaActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtCorretaActionPerformed

    private void txtExplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExplicacaoActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtExplicacaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInserir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotLimpar;
    private javax.swing.JButton BotSalvar;
    private javax.swing.JComboBox<String> dificuldadeComboBox;
    private javax.swing.JComboBox<String> faseComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel loginTitulo;
    private javax.swing.JLabel tituloDificuldade;
    private javax.swing.JLabel tituloFase;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCorreta;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtExplicacao;
    private javax.swing.JTextField txtPergunta;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables
}
