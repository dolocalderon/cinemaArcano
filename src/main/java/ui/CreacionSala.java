/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.cinelugar.Sala;
import cine.user.Sesion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import persistencia.Persistencia;

/**
 *
 * @author Diego
 */
public class CreacionSala extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public CreacionSala() {
        initComponents();
        setLocationRelativeTo(null);
        botones();
        lblNombreSala.setText(sala.getNombre());
    }
    Sala sala = new Sala();
    int filas = sala.getFilas();
    int columnas = sala.getColumnas();
    int largoBoton = 50;
    int anchoBoton = 25;
    int ejeX = 260;
    int ejeY = 30;

    public JToggleButton[][] jtBotones = new JToggleButton[filas][columnas];

    public void botones() {
        jtBotones = new JToggleButton[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                jtBotones[i][j] = new JToggleButton();
                jtBotones[i][j].setBounds(ejeX, ejeY, largoBoton, anchoBoton);
                ImageIcon iconoButaca = new ImageIcon("src\\main\\images\\seat-available.png");
                Image imagenButaca = iconoButaca.getImage();
                ImageIcon iconoButacaAgrandado = new ImageIcon(imagenButaca.getScaledInstance(35, 25, Image.SCALE_DEFAULT));
                jtBotones[i][j].setIcon(iconoButacaAgrandado);
                jtBotones[i][j].setIcon(iconoButacaAgrandado);
                jtBotones[i][j].setOpaque(false);
                jtBotones[i][j].setContentAreaFilled(false);
                jtBotones[i][j].setBorderPainted(false);

                AccionBotones accion = new AccionBotones();
                jtBotones[i][j].addActionListener(accion);

                pnlBotones.add(jtBotones[i][j]);
                ejeX += 40;//separacion ejeX

            }
            ejeX = 260; //reseteo la poss inicial
            ejeY += 44; //separacion ejeY
        }
    }

    public class AccionBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (e.getSource().equals(jtBotones[i][j])) {
                        if (jtBotones[i][j].isSelected()) {
                            ImageIcon iconoButaca = new ImageIcon("src\\main\\images\\seat-selected.png");
                            Image imagenButaca = iconoButaca.getImage();
                            ImageIcon iconoButacaAgrandado = new ImageIcon(imagenButaca.getScaledInstance(45, 30, Image.SCALE_DEFAULT));
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setOpaque(false);
                            jtBotones[i][j].setContentAreaFilled(false);
                            jtBotones[i][j].setBorderPainted(false);
                            sala.getButacas()[i][j].setExiste(true);
                            sala.setCapacidad(sala.getCapacidad() + 1);
                            //aumentar contador para comparar con cantidad de boletos
                        } else {
                            ImageIcon iconoButaca = new ImageIcon("src\\main\\images\\seat-available.png");
                            Image imagenButaca = iconoButaca.getImage();
                            ImageIcon iconoButacaAgrandado = new ImageIcon(imagenButaca.getScaledInstance(35, 25, Image.SCALE_DEFAULT));
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setIcon(iconoButacaAgrandado);
                            jtBotones[i][j].setOpaque(false);
                            jtBotones[i][j].setContentAreaFilled(false);
                            jtBotones[i][j].setBorderPainted(false);

                            sala.getButacas()[i][j].setExiste(false);
                            sala.setCapacidad(sala.getCapacidad() - 1);
                            //disminuir contador
                        }
                    }
                }
            }
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

        background = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        lblNombreSala = new javax.swing.JLabel();
        checkAtmos = new javax.swing.JCheckBox();
        btnVolver = new javax.swing.JButton();
        btnAgregarSala = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(9, 35, 52));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setResizable(false);

        background.setBackground(new java.awt.Color(9, 35, 52));
        background.setMaximumSize(new java.awt.Dimension(1280, 720));
        background.setMinimumSize(new java.awt.Dimension(1280, 720));
        background.setName(""); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1260, 720));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones.setBackground(new java.awt.Color(9, 35, 52));

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        background.add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1240, 470));

        lblNombreSala.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombreSala.setForeground(new java.awt.Color(255, 255, 255));
        background.add(lblNombreSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        checkAtmos.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        checkAtmos.setForeground(new java.awt.Color(255, 255, 255));
        checkAtmos.setText("ATMOS");
        background.add(checkAtmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 110, 40));

        btnVolver.setBackground(new java.awt.Color(255, 0, 30));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Atras");
        btnVolver.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        background.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 40));

        btnAgregarSala.setBackground(new java.awt.Color(255, 0, 30));
        btnAgregarSala.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarSala.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarSala.setText("Agregar Sala");
        btnAgregarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSalaActionPerformed(evt);
            }
        });
        background.add(btnAgregarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, 170, 50));

        jPanel1.setBackground(new java.awt.Color(20, 71, 103));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PANTALLA");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        if (Sesion.getTipo().equals("Admin")) {
            this.dispose();
            MenuAdmin admin = new MenuAdmin();
            admin.setVisible(true);
        } else if (Sesion.getTipo().equals("Gerente")) {
            this.dispose();
            MenuGerente gerente = new MenuGerente();
            gerente.setVisible(true);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSalaActionPerformed
        // TODO add your handling code here:
        if (sala.getCapacidad() > 0) {
            if (checkAtmos.isSelected()) {
                sala.setAtmos(true);
            }
            Cine.getListaSalas().add(sala);
            Persistencia.actualizarSalas();
            JOptionPane.showMessageDialog(null, "Sala creada correctamente!");
            btnVolverActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(null, "La sala debe contener al menos 1 asiento");
        }
    }//GEN-LAST:event_btnAgregarSalaActionPerformed

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
            java.util.logging.Logger.getLogger(CreacionSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreacionSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreacionSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreacionSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreacionSala().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAgregarSala;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox checkAtmos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombreSala;
    private javax.swing.JPanel pnlBotones;
    // End of variables declaration//GEN-END:variables
}
