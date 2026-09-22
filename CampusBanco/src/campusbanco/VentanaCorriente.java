// Programación Orientada a Objetos
// Proyecto Final - Banco 
// By Otero Barragán Nahomi Natalia

package campusbanco;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCorriente extends javax.swing.JFrame {
    
ArrayList<CuentaCorriente> listaUsuarios = new ArrayList<CuentaCorriente>(); 
CuentaCorriente usuario; 
Cuenta cuenta; 


public VentanaCorriente() {
    initComponents();
    this.setTitle("Campus Bank");
    Image img=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo-cucea.png"));
    this.setIconImage(img);
    lblLogo.setIcon(new ImageIcon(img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
    this.setLocationRelativeTo(null);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarD = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtNumeroC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cboCuenta = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnGuardarC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cboUsuarioC = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboMovimiento = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtMontoM = new javax.swing.JTextField();
        btnUsarC = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblMontoInicial = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblNumeroCuenta = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblLimiteC = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Campus Bank");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-cucea.png"))); // NOI18N
        lblLogo.setText("jLabel2");
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Cuenta Corriente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Usuario"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Correo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnGuardarD.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardarD.setText("Guardar");
        btnGuardarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("N. de Cuenta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 10));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 170, -1));
        jPanel1.add(txtNumeroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 290, 230));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Usuario:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cboCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(cboCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 160, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Monto Inicial:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel2.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, -1));

        btnGuardarC.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardarC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardarC.setText("Guardar");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 270, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Usuario:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cboUsuarioC.setBackground(new java.awt.Color(204, 204, 204));
        cboUsuarioC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboUsuarioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboUsuarioCActionPerformed(evt);
            }
        });
        jPanel3.add(cboUsuarioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Tipo de Movimiento:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        cboMovimiento.setBackground(new java.awt.Color(204, 204, 204));
        cboMovimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposito", "Retiro" }));
        jPanel3.add(cboMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 130, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Monto:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar Movimiento");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 150, 30));
        jPanel3.add(txtMontoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 90, 30));

        btnUsarC.setBackground(new java.awt.Color(153, 153, 153));
        btnUsarC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUsarC.setText("Usar Credito");
        btnUsarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsarCActionPerformed(evt);
            }
        });
        jPanel3.add(btnUsarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 43, 100, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 800, 110));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Cuenta"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Nombre:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("N. de Cuenta:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 10));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Correo:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Limite de credito: ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel4.add(lblMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));
        jPanel4.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));
        jPanel4.add(lblNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));
        jPanel4.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Monto Inicial:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel4.add(lblLimiteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 300, 210));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Saldo");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        lblSaldo.setBackground(new java.awt.Color(204, 204, 204));
        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 110, 30));

        btnInicio.setBackground(new java.awt.Color(204, 204, 204));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDActionPerformed
        CuentaCorriente c = new CuentaCorriente();
        c.setNombreTitular(txtNombre.getText());
        c.setNumeroCuenta(txtNumeroC.getText());
        c.setCorreoElectronico(txtCorreo.getText());
        borrarFormUsuario(); 
        listaUsuarios.add(c); 
        llenarComboUsuario();
    }//GEN-LAST:event_btnGuardarDActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        BancoInicio bI = new BancoInicio();
        bI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        // TODO add your handling code here:
        usuario = listaUsuarios.get(cboCuenta.getSelectedIndex());
        Cuenta cuenta = new Cuenta();
        cuenta.setMontoInicial(Double.parseDouble(txtMonto.getText()));
        usuario.AgregarCuenta(cuenta);
        
        Movimiento m = new Movimiento();
        m.setFecha(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        m.setTipoMovimiento("APERTURA");
        m.setSaldo(Double.parseDouble(txtMonto.getText()));
        lblSaldo.setText(txtMonto.getText());
        cuenta.AgregarMovimientos(m);
        borrarFormCuenta();
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void cboUsuarioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboUsuarioCActionPerformed
        // TODO add your handling code here:
        MostrarDatos(); 
    }//GEN-LAST:event_cboUsuarioCActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        usuario = listaUsuarios.get(cboCuenta.getSelectedIndex());
        String Movimiento = (String) cboMovimiento.getSelectedItem(); // obtiene el tipo seleccionado
        Movimiento m = new Movimiento(); 
        double saldo = Double.parseDouble(lblSaldo.getText());
        double monto = 0;
        monto = Double.parseDouble(txtMontoM.getText());
        
        // Verificar si el monto ingresado es mayor que el saldo
        if (Movimiento != null && Movimiento.endsWith("Retiro")) {
            if (monto > saldo) {
            // Si el monto es mayor que el saldo, mostrar un mensaje de error
            JOptionPane.showMessageDialog(null, "Error: No tienes suficiente saldo para realizar el retiro.");
            borrarForMonto(); 
            return;  // Salir del método si no hay suficiente saldo
        }
            if (saldo <= 0) {
                // Si no hay saldo en la cuenta para retirar
                JOptionPane.showMessageDialog(null, "Error: No hay saldo disponible para realizar el retiro.");
                return;  // Salir del método si no hay saldo
            }
        
        saldo -= monto;  
        lblSaldo.setText(String.valueOf(saldo));  
        } else if (Movimiento != null && Movimiento.endsWith("Deposito")) {
            // En un depósito, sumamos el saldo
            saldo += monto;  // Aumentamos el saldo
            lblSaldo.setText(String.valueOf(saldo));  
        }
        
        m.setSaldo(saldo);
        usuario.setSaldoActual(saldo);
        borrarForMonto(); 
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnUsarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsarCActionPerformed
        // TODO add your handling code here:
        usuario.Credito();
    
    }//GEN-LAST:event_btnUsarCActionPerformed

    // Metodo
    public void borrarFormUsuario(){
        txtNombre.setText("");
        txtNumeroC.setText("");
        txtCorreo.setText("");
    } // BorrarFormulario
    
    public void borrarFormCuenta(){
        cboCuenta.setSelectedIndex(0);
        txtMonto.setText("");
    } // borrarFormCuenta
    
    public void borrarForMonto(){
        txtMontoM.setText("");
    }
    
    public void llenarComboUsuario(){
        Object usuario[] = new Object[listaUsuarios.size()]; 
        int i = 0;
        for(CuentaCorriente c : listaUsuarios){
            usuario[i] = c.getNombreTitular();
            i++;
        } // for
        cboCuenta.setModel(new DefaultComboBoxModel(usuario));
        cboUsuarioC.setModel(new DefaultComboBoxModel(usuario));
    } // llenarCombosUsuario
    
    public String Moneda(double cantidad){
        cantidad=Math.round(cantidad*100.0)/100.0;
        DecimalFormat formato = new DecimalFormat("$ #, ###.## MXN");
        return formato.format(cantidad);
    } // Moneda
    
    
    public void MostrarDatos(){
        usuario = listaUsuarios.get(cboUsuarioC.getSelectedIndex());
        lblNombreUsuario.setText(usuario.getNombreTitular());
        lblNumeroCuenta.setText(usuario.getNumeroCuenta());
        lblCorreo.setText(usuario.getCorreoElectronico());
        lblLimiteC.setText(String.valueOf(usuario.getLimiteCredito()));
        
        if(usuario.getMiscuentas().size()>0){
            Cuenta CuentaBancaria = usuario.getMiscuentas().get(0);
            double saldoCuenta = CuentaBancaria.getMontoInicial();
            lblMontoInicial.setText(Moneda(CuentaBancaria.getMontoInicial())); 
            lblSaldo.setText(String.valueOf(saldoCuenta));  // Asegúrate de que lblSaldo esté actualizado
        }else{
            lblMontoInicial.setText("");
            lblSaldo.setText("");
        } // else      
    } // mostrar datos 
   
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
            java.util.logging.Logger.getLogger(VentanaCorriente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCorriente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCorriente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCorriente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCorriente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnGuardarD;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnUsarC;
    private javax.swing.JComboBox<String> cboCuenta;
    private javax.swing.JComboBox<String> cboMovimiento;
    private javax.swing.JComboBox<String> cboUsuarioC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblLimiteC;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMontoInicial;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNumeroCuenta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtMontoM;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroC;
    // End of variables declaration//GEN-END:variables
}
