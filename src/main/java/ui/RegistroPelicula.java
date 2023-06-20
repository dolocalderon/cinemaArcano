/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.cinelugar.Pelicula;
import cine.user.Sesion;
import excepciones.CampoVacioException;
import excepciones.PeliculaRegistradaException;
import excepciones.SoloNumerosException;
import java.awt.Color;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import persistencia.PersistenceCollecion;
import persistencia.Persistencia;
import validacion.Validaciones;

/**
 *
 * @author Hoid
 */
public class RegistroPelicula extends javax.swing.JFrame {
    Pelicula pelicula = new Pelicula();
    public static final String rutaDestino = "src\\main\\images\\";
    /**
     * Creates new form RegistroPelicula
     */
    public RegistroPelicula() {
        initComponents();
        lblImagen.setHorizontalAlignment(JLabel.CENTER);
        lblImagen.setBorder(new LineBorder(Color.black,2,true));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTextImagen = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopsis = new javax.swing.JTextArea();
        listGenero = new javax.swing.JComboBox<>();
        listClas = new javax.swing.JComboBox<>();
        check3d = new javax.swing.JCheckBox();
        check3dAtmos = new javax.swing.JCheckBox();
        dateFecha = new com.toedter.calendar.JDateChooser();
        check2dAtmos = new javax.swing.JCheckBox();
        check2d = new javax.swing.JCheckBox();
        lblImagen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JLabel();
        btnVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 699));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel2.setText("Genero");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 111, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel3.setText("Duracion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel4.setText("Clasificacion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 156, -1, -1));

        lblTextImagen.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        lblTextImagen.setText("Cargar Imagen de cartelera");
        jPanel1.add(lblTextImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel6.setText("Sinopsis:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 207, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 25, 209, -1));
        jPanel1.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 69, 80, -1));

        txtSinopsis.setColumns(20);
        txtSinopsis.setRows(5);
        jScrollPane1.setViewportView(txtSinopsis);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 237, 280, 131));

        listGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acción", "Aventura", "Comedia", "Documental", "Drama", "Horror", "Suspenso" }));
        listGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(listGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 112, 140, -1));

        listClas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G", "PG13", "R", "NC17" }));
        jPanel1.add(listClas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 157, 130, -1));

        check3d.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        check3d.setText("3D");
        check3d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                check3dMousePressed(evt);
            }
        });
        jPanel1.add(check3d, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        check3dAtmos.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        check3dAtmos.setText("3D Atmos");
        check3dAtmos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                check3dAtmosMousePressed(evt);
            }
        });
        jPanel1.add(check3dAtmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));
        jPanel1.add(dateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 155, 29));

        check2dAtmos.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        check2dAtmos.setText("2D Atmos");
        jPanel1.add(check2dAtmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        check2d.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        check2d.setText("2D");
        jPanel1.add(check2d, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 65, -1, -1));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 150, 230));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel7.setText("Fecha de estreno");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        btnCargar.setText("Cargar Imagen");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 120, 40));

        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimpiarMousePressed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 100, 40));

        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 90, 40));

        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVolverMousePressed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 94, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(800, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void listGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listGeneroActionPerformed

    private void btnVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMousePressed
        if (Sesion.getTipo().equals("Admin")) {
            this.dispose();
            MenuAdmin admin = new MenuAdmin();
            admin.setVisible(true);
        } else if (Sesion.getTipo().equals("Gerente")) {
            this.dispose();
            MenuGerente gerente = new MenuGerente();
            gerente.setVisible(true);
        }
    }//GEN-LAST:event_btnVolverMousePressed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        try{
            
            Validaciones.validarCampo(txtNombre.getText());
            Validaciones.validarCampo(txtSinopsis.getText());
            Validaciones.validarCampo(dateFecha.getDateFormatString());
            Validaciones.validarNumeros(txtDuracion.getText());
            Validaciones.validarPelicula(txtNombre.getText());
            
            pelicula.setNombre(txtNombre.getText());
            pelicula.setDuracion(Integer.parseInt(txtDuracion.getText()));
            pelicula.setGenero(listGenero.getSelectedItem().toString());
            pelicula.setClasificacion(listClas.getSelectedItem().toString());
            pelicula.setDescripcion(txtSinopsis.getText());
            pelicula.setFechaEstreno((Date)dateFecha.getDate());
            if(check3d.isSelected()){
                pelicula.agregarTipo(true,"3D");
            }
            if(check2d.isSelected()){
                pelicula.agregarTipo(true, "2D");
            }
            if(check3dAtmos.isSelected()){
                pelicula.agregarTipo(true, "3D Atmos");
            }
            if(check2dAtmos.isSelected()){
                pelicula.agregarTipo(true, "2D Atmos");
            }
            Cine.getListaPeliculas().add(pelicula);
            Persistencia.actualizarPeliculas();
            
            JOptionPane.showMessageDialog(null,"Pelicula agregada exitosamente!\n"+ pelicula.toString()); 
        }catch (CampoVacioException | SoloNumerosException | PeliculaRegistradaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMousePressed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtDuracion.setText("");
        txtSinopsis.setText("");
        check3d.setSelected(false);
        check3dAtmos.setSelected(false);
        check2d.setSelected(false);
        check2dAtmos.setSelected(false);
        dateFecha.setDate(null);
    }//GEN-LAST:event_btnLimpiarMousePressed

    private void check3dMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check3dMousePressed
        // TODO add your handling code here:
        check2d.setSelected(!check3d.isSelected());
    }//GEN-LAST:event_check3dMousePressed

    private void check3dAtmosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check3dAtmosMousePressed
        // TODO add your handling code here:
        check2dAtmos.setSelected(!check3dAtmos.isSelected());
    }//GEN-LAST:event_check3dAtmosMousePressed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        String rutaDest = "";
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, JFIF, PNG & GIF", "jpg","png","gif","jfif");
        jFileChooser.setFileFilter(filtrado);
        
        int respuesta = jFileChooser.showOpenDialog(this);
        
        try {
            if(respuesta == jFileChooser.APPROVE_OPTION){
                rutaDest = rutaDestino + jFileChooser.getSelectedFile().getName();
                Path Destino = Paths.get(rutaDest);
                String origin = jFileChooser.getSelectedFile().getPath();
                Path Origen = Paths.get(origin);
                Files.copy(Origen, Destino, StandardCopyOption.REPLACE_EXISTING);
                pelicula.setRutaImagen(rutaDest);
                Image img = new ImageIcon(pelicula.getRutaImagen()).getImage();
                ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
                lblImagen.setIcon(imgIcon);
            }
        } catch (Exception e) {
            System.out.println("Fallo la carga de datos de las imagenes");
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegistroPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPelicula().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private static javax.swing.JButton btnCargar;
    private javax.swing.JLabel btnLimpiar;
    private static javax.swing.JLabel btnVolver;
    private javax.swing.JCheckBox check2d;
    private javax.swing.JCheckBox check2dAtmos;
    private javax.swing.JCheckBox check3d;
    private javax.swing.JCheckBox check3dAtmos;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTextImagen;
    private javax.swing.JComboBox<String> listClas;
    private javax.swing.JComboBox<String> listGenero;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSinopsis;
    // End of variables declaration//GEN-END:variables
}
