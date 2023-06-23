/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.user.*;
import excepciones.CampoVacioException;
import excepciones.EmailException;
import excepciones.LongitudPasswordException;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import persistencia.Persistencia;
import validacion.Validaciones;

/**
 *
 * @author Diego
 */
public class Login extends javax.swing.JFrame {

    private final String imgCineDir = "src\\main\\images\\prueba1.png";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        iniciar();
    }

    private void iniciar() {
        lblImagenCine.setHorizontalAlignment(JLabel.CENTER);

        try {
            Image img = new ImageIcon(imgCineDir).getImage();
            ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(852, 720, Image.SCALE_SMOOTH));
            lblImagenCine.setIcon(imgIcon);

            this.repaint();
        } catch (Exception e) {
            System.out.println("Error al cargar Imagenes");
        }
    }

    private void validarInicioSesion() {
        try {
            Validaciones.validarEmail(txtEmail.getText());
            Validaciones.validarPassword(txtPassword.getText());
            if (Cine.validarLoginYCargarSesion(txtEmail.getText(), txtPassword.getText()) == true) {
                Sesion.setEmailLogeado(txtEmail.getText());
                if (Sesion.getTipo().equals("Cliente")) {
                    this.dispose();
                    new MenuCliente().setVisible(true);
                } else if (Sesion.getTipo().equals("Gerente")) {
                    this.dispose();
                    new MenuGerente().setVisible(true);
                } else if (Sesion.getTipo().equals("Admin")) {
                    this.dispose();
                    new MenuAdmin().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Email o contraseña incorrecta!");
            }
        } catch (CampoVacioException | EmailException | LongitudPasswordException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblEmail = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        lblCineNombre = new javax.swing.JLabel();
        lblImagenCine = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIniciarSesion = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(9, 35, 52));
        jPanel1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setBackground(new java.awt.Color(17, 61, 88));
        txtEmail.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(216, 220, 255));
        txtEmail.setVerifyInputWhenFocusTarget(false);
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEmailMouseExited(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 300, 45));

        txtPassword.setBackground(new java.awt.Color(17, 61, 88));
        txtPassword.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(216, 220, 255));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPasswordMouseExited(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 300, 45));

        lblEmail.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(216, 220, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("Email:");
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, 30));

        lblContraseña.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(216, 220, 255));
        lblContraseña.setText("Contraseña:");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 110, 30));

        jPanel3.setBackground(new java.awt.Color(170, 34, 45));

        btnSalir.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(216, 220, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("X");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 30));

        lblCineNombre.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblCineNombre.setForeground(new java.awt.Color(216, 220, 255));
        lblCineNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCineNombre.setText("Cine Arcano");
        jPanel1.add(lblCineNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 250, 90));
        jPanel1.add(lblImagenCine, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 860, 720));

        jPanel2.setBackground(new java.awt.Color(170, 34, 45));

        btnIniciarSesion.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(216, 220, 255));
        btnIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIniciarSesion.setText("INICIAR SESIÓN");
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 200, 45));

        btnRegistro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(216, 220, 255));
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistro.setText("Registrarse");
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistroMousePressed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseEntered
        // TODO add your handling code here:
        txtEmail.setBorder(new LineBorder(new Color(44, 117, 160), 2, true));
        //txtEmail.setForeground(new Color(60, 229, 177));
    }//GEN-LAST:event_txtEmailMouseEntered

    private void txtEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseExited
        // TODO add your handling code here:
        txtEmail.setBorder(new LineBorder(new Color(17, 61, 88), 2, true));
        //txtEmail.setForeground(new Color(17, 61, 88));
    }//GEN-LAST:event_txtEmailMouseExited

    private void txtPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseEntered
        // TODO add your handling code here:
        txtPassword.setBorder(new LineBorder(new Color(44, 117, 160), 2, true));
    }//GEN-LAST:event_txtPasswordMouseEntered

    private void txtPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseExited
        // TODO add your handling code here:
        txtPassword.setBorder(new LineBorder(new Color(17, 61, 88), 2, true));
    }//GEN-LAST:event_txtPasswordMouseExited

    private void btnIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMousePressed
        // TODO add your handling code here:
        validarInicioSesion();  
    }//GEN-LAST:event_btnIniciarSesionMousePressed

    private void btnRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMousePressed
        // TODO add your handling code here:
        new RegistroCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroMousePressed

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered

        jPanel2.setBackground(new Color(204, 40, 54));
        btnIniciarSesion.setForeground(new Color(255, 255, 255));
        
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(170, 34, 45));
        btnIniciarSesion.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseExited
        // TODO add your handling code here:
        btnRegistro.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnRegistroMouseExited

    private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseEntered
        // TODO add your handling code here:
        btnRegistro.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnRegistroMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(170, 34, 45));
        btnSalir.setForeground(new Color(216, 220, 255));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(204, 40, 54));
        btnSalir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSalirMouseEntered

    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Persistencia.leerDatos();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
        Admin admin = new Admin("rtoresani@gmail.com", "12345678", "Rafael", "Toresani");
        Cliente cliente=new Cliente("dp@gmail.com","12345678","Diego","Pineda");
        Cine.getListaUsuarios().add(admin);
        Cine.getListaUsuarios().add(cliente);
        Persistencia.actualizarUsuarios();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnIniciarSesion;
    private javax.swing.JLabel btnRegistro;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCineNombre;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEmail;
    private static javax.swing.JLabel lblImagenCine;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
