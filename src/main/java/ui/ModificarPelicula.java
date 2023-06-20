/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import cine.cinelugar.Cine;
import cine.cinelugar.Pelicula;
import com.toedter.calendar.JCalendar;
import excepciones.CampoVacioException;
import excepciones.SoloNumerosException;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import persistencia.Persistencia;
import validacion.Validaciones;
import cine.user.Sesion;
import java.awt.Color;
import java.awt.Image;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import persistencia.PersistenceCollecion;

/**
 *
 * @author Hoid
 */
public class ModificarPelicula extends javax.swing.JFrame {

    /**
     * Creates new form ModificarPelicula
     */
    private Pelicula pelicula;
    public static final String rutaDestino = "src\\main\\images\\";
    
    public ModificarPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
        initComponents();
        cargarDatos();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopsis = new javax.swing.JTextArea();
        listGenero = new javax.swing.JComboBox<>();
        listClas = new javax.swing.JComboBox<>();
        dateFecha = new com.toedter.calendar.JDateChooser();
        btnModificar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
        btnVolver = new javax.swing.JLabel();
        check2d = new javax.swing.JCheckBox();
        check2dAtmos = new javax.swing.JCheckBox();
        check3d = new javax.swing.JCheckBox();
        check3dAtmos = new javax.swing.JCheckBox();
        lblImagen = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        lblTextImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel5.setText("Fecha de estreno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 237, 240, 131));

        listGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acción", "Aventura", "Comedia", "Documental", "Drama", "Horror", "Suspenso" }));
        listGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(listGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 112, 140, -1));

        listClas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G", "PG13", "R", "NC17" }));
        jPanel1.add(listClas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 157, 130, -1));
        jPanel1.add(dateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 155, 29));

        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarMousePressed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 100, 40));

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

        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVolverMousePressed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 94, 40));

        check2d.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        check2d.setText("2D");
        jPanel1.add(check2d, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 65, -1, -1));

        check2dAtmos.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        check2dAtmos.setText("2D Atmos");
        jPanel1.add(check2dAtmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

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
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 150, 230));

        btnCargar.setText("Cargar Imagen");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 110, 40));

        lblTextImagen.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        lblTextImagen.setText("Cargar Imagen de cartelera");
        jPanel1.add(lblTextImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        
    }
    
    public void iniciar(){
        lblImagen.setHorizontalAlignment(JLabel.CENTER);
        lblImagen.setBorder(new LineBorder(Color.black,2,true));
        try{
            Image img = new ImageIcon(pelicula.getRutaImagen()).getImage();
            ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(imgIcon);
        }catch (Exception e){
            System.out.println("Algo se rompio al leer los datos de la Pelicula");
        }  

    }//GEN-LAST:event_btnVolverMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void listGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listGeneroActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked

    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
        try {
            String nombreViejo = pelicula.getNombre();
            Boolean flag = false;
            Validaciones.validarCampo(txtNombre.getText());
            Validaciones.validarCampo(txtSinopsis.getText());
            Validaciones.validarCampo(dateFecha.getDateFormatString());
            Validaciones.validarNumeros(txtDuracion.getText());
            
            this.pelicula.setNombre(txtNombre.getText());
            this.pelicula.setDuracion(Integer.parseInt(txtDuracion.getText()));
            this.pelicula.setGenero(listGenero.getSelectedItem().toString());
            this.pelicula.setClasificacion(listClas.getSelectedItem().toString());
            this.pelicula.setDescripcion(txtSinopsis.getText());
            this.pelicula.setFechaEstreno((Date) dateFecha.getDate());
            if (check3d.isSelected()) {
                pelicula.agregarTipo(true, "3D");
            }
            if (check2d.isSelected()) {
                pelicula.agregarTipo(true, "2D");
            }
            if (check3dAtmos.isSelected()) {
                pelicula.agregarTipo(true, "3D Atmos");
            }
            if (check2dAtmos.isSelected()) {
                pelicula.agregarTipo(true, "2D Atmos");
            }
            for (int i = 0; i < Cine.getListaPeliculas().size() && flag == false; i++) {
                if (Cine.getListaPeliculas().get(i).getNombre().equals(nombreViejo)) {
                    Cine.getListaPeliculas().set(i, pelicula);
                    flag = true;
                }
            }
            Persistencia.actualizarPeliculas();
            
            JOptionPane.showMessageDialog(null, "Pelicula agregada exitosamente!\n" + pelicula.toString());
        } catch (CampoVacioException | SoloNumerosException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnModificarMousePressed

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
    
    private void cargarDatos() {
        //===========================
        txtDuracion.setText(String.valueOf(pelicula.getDuracion()));
        txtNombre.setText(pelicula.getNombre());
        txtSinopsis.setText(pelicula.getDescripcion());
        listGenero.setSelectedItem(pelicula.getGenero());
        listClas.setSelectedItem(pelicula.getClasificacion());
        iniciar();
        if (pelicula.getFechaEstreno() != null) {
            dateFecha.setDate(pelicula.getFechaEstreno());
        }
        
        for (Map.Entry<String, Boolean> entry : pelicula.getTipo().entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            if (key.equals("2D")) {
                if (value) {
                    check2d.setSelected(true);
                }
            }
            if (key.equals("3D")) {
                if (value) {
                    check3d.setSelected(true);
                }
            }
            if (key.equals("2D ATMOS")) {
                if (value) {
                    check2dAtmos.setSelected(true);
                }
            }
            if (key.equals("3D ATMOS")) {
                if (value) {
                    check3dAtmos.setSelected(true);
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnCargar;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel btnModificar;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JCheckBox check2d;
    private javax.swing.JCheckBox check2dAtmos;
    private javax.swing.JCheckBox check3d;
    private javax.swing.JCheckBox check3dAtmos;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
