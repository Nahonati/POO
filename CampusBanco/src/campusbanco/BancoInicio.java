// Programación Orientada a Objetos
// Proyecto Final - Banco 
// By Otero Barragán Nahomi Natalia

package campusbanco;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class BancoInicio extends javax.swing.JFrame {

      
    public BancoInicio() {
        initComponents();
        this.setTitle("Campus Bank");
        Image img=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo-cucea.png"));
        this.setIconImage(img);
        lblLogo.setIcon(new ImageIcon(img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);
        this.pack();
        this.setMinimumSize(new Dimension(500, 400));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBancaria = new javax.swing.JButton();
        btnCorriente = new javax.swing.JButton();
        btnAhorro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Campus Bank");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-cucea.png"))); // NOI18N
        lblLogo.setText("jLabel2");
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Selecciona el tipo de cuenta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        btnBancaria.setBackground(new java.awt.Color(204, 204, 204));
        btnBancaria.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnBancaria.setText("Cuenta Bancaria");
        btnBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBancariaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, 40));

        btnCorriente.setBackground(new java.awt.Color(204, 204, 204));
        btnCorriente.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnCorriente.setText("Cuenta Corriente");
        btnCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 150, 40));

        btnAhorro.setBackground(new java.awt.Color(204, 204, 204));
        btnAhorro.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAhorro.setText("Cuenta de Ahorro");
        btnAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAhorroActionPerformed(evt);
            }
        });
        getContentPane().add(btnAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // btn Bancaria
    private void btnBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBancariaActionPerformed
        // TODO add your handling code here:
        VentanaBancaria vB = new VentanaBancaria();
        vB.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBancariaActionPerformed

    // btn Corriente
    private void btnCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrienteActionPerformed
        // TODO add your handling code here:
        VentanaCorriente vC = new VentanaCorriente(); 
        vC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCorrienteActionPerformed

    // btn Ahorro
    private void btnAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAhorroActionPerformed
        // TODO add your handling code here:
        VentanaAhorro vA = new VentanaAhorro();
        vA.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAhorroActionPerformed

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
            java.util.logging.Logger.getLogger(BancoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAhorro;
    private javax.swing.JButton btnBancaria;
    private javax.swing.JButton btnCorriente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
