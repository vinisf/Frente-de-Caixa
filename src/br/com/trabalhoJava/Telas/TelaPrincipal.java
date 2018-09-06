/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhoJava.Telas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/br/com/trabalhoJava/Icones/jdesktopFundo.png"));
        Image image = icon.getImage();
        desktop = new javax.swing.JDesktopPane(){

            public void paintComponet(Graphics g){
                g.drawImage(image,1,2,getWidth(),getHeight(),this);}

        };
        jLabel7_Cozinheiro = new javax.swing.JLabel();
        jLabel_TelaPrincipal = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadFun = new javax.swing.JMenuItem();
        menCadProd = new javax.swing.JMenuItem();
        menPed = new javax.swing.JMenu();
        menAddPed = new javax.swing.JMenuItem();
        menOp = new javax.swing.JMenu();
        menOpSai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setBackground(new java.awt.Color(255, 255, 255));
        desktop.setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel7_Cozinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhoJava/Icones/chef.png"))); // NOI18N
        desktop.add(jLabel7_Cozinheiro);
        jLabel7_Cozinheiro.setBounds(430, 310, 120, 140);

        jLabel_TelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhoJava/Icones/mad_wood-483965_640 (1).jpg"))); // NOI18N
        desktop.add(jLabel_TelaPrincipal);
        jLabel_TelaPrincipal.setBounds(0, 0, 760, 460);

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usúario");

        lblData.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData.setText("Data");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("   Bem Vindo!");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/trabalhoJava/Icones/1493505964_food.png"))); // NOI18N

        menCad.setText("Cadastro");

        menCadFun.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        menCadFun.setText("Usuario");
        menCadFun.setEnabled(false);
        menCadFun.setSelected(true);
        menCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadFunActionPerformed(evt);
            }
        });
        menCad.add(menCadFun);

        menCadProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menCadProd.setText("Produto");
        menCadProd.setFocusable(true);
        menCadProd.setOpaque(true);
        menCadProd.setRolloverEnabled(true);
        menCadProd.setSelected(true);
        menCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadProdActionPerformed(evt);
            }
        });
        menCad.add(menCadProd);

        menu.add(menCad);

        menPed.setText("Pedido");

        menAddPed.setText("Adicionar ");
        menAddPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAddPedActionPerformed(evt);
            }
        });
        menPed.add(menAddPed);

        menu.add(menPed);

        menOp.setText("Opções");

        menOpSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menOpSai.setText("Sair");
        menOpSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpSaiActionPerformed(evt);
            }
        });
        menOp.add(menOpSai);

        menu.add(menOp);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblData))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblUsuario)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(lblData)
                .addGap(32, 32, 32)
                .addComponent(jLabel1))
        );

        setSize(new java.awt.Dimension(900, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        //Substitui a label lblData pela data atual ao iniciar o form
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    private void menOpSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpSaiActionPerformed
        // TODO add your handling code here:
        //exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?", "atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menOpSaiActionPerformed

    private void menCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadFunActionPerformed
        // TODO add your handling code here:
        //Chamando a tela usuario no jDesktop
        TelaUsuario usuario = null;
        try {
            usuario = new TelaUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_menCadFunActionPerformed

    private void menCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadProdActionPerformed
        // TODO add your handling code here:
        //Chamando a tela produto no jDesktop
        TelaProduto produto = null;
        try {
            produto = new TelaProduto();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        produto.setVisible(true);
        desktop.add(produto);
    }//GEN-LAST:event_menCadProdActionPerformed

    private void menAddPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAddPedActionPerformed
        // TODO add your handling code here:
        //Chamando a tela pedido no jDesktop
        TelaPedido pedido = null;
        try {
            pedido = new TelaPedido();
          
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        pedido.setVisible(true);
        desktop.add(pedido);

    }//GEN-LAST:event_menAddPedActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7_Cozinheiro;
    private javax.swing.JLabel jLabel_TelaPrincipal;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem menAddPed;
    private javax.swing.JMenu menCad;
    public static javax.swing.JMenuItem menCadFun;
    private javax.swing.JMenuItem menCadProd;
    private javax.swing.JMenu menOp;
    private javax.swing.JMenuItem menOpSai;
    private javax.swing.JMenu menPed;
    private javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables
}