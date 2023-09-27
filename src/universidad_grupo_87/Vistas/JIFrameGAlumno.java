/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_grupo_87.Vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidad_grupo_87.AccesoADatos.AlumnoData;
import universidad_grupo_87.Entidades.Alumno;

/**
 *
 * @author Discar
 */
public class JIFrameGAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFrameGAlumno
     */
    public JIFrameGAlumno() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jCheckBoxEstado = new javax.swing.JCheckBox();
        jDateFechaN = new com.toedter.calendar.JDateChooser();

        jLabel5.setText("jLabel5");

        setClosable(true);
        setTitle("Gestion de Alumno");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALUMNO");

        jLabel2.setText("DOCUMENTO: ");

        jLabel3.setText("APELLIDO: ");

        jLabel4.setText("NOMBRE: ");

        jLabel6.setText("ESTADO: ");

        jLabel7.setText("FECHA DE NACIMIENTO: ");

        jTApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTApellidoKeyTyped(evt);
            }
        });

        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreKeyTyped(evt);
            }
        });

        jBuscar.setText("BUSCAR");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setText("NUEVO");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBModificar.setText("GUARDAR");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCheckBoxEstado.setText("ACTIVO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBNuevo)
                        .addGap(29, 29, 29)
                        .addComponent(jBEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                        .addComponent(jBuscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBModificar)
                                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBSalir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxEstado)
                            .addComponent(jDateFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBoxEstado))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jDateFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBModificar)
                    .addComponent(jBSalir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:
        try{
        int dni = Integer.parseInt(jTDni.getText());
        String apellido = jTApellido.getText();
        String nombre = jTNombre.getText();
        if(apellido.isEmpty()){
               JOptionPane.showMessageDialog(null, "Porfavor ingrese un APELLIDO.");
        }else{
            if(nombre.isEmpty()){
                JOptionPane.showMessageDialog(null, "Porfavor ingrese un APELLIDO.");
            }else{
                
            }
            boolean estado = jCheckBoxEstado.isSelected();
            LocalDate fNac = jDateFechaN.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Alumno alu = new Alumno(dni, apellido, nombre, fNac, estado);
            AlumnoData aluData = new AlumnoData();
            aluData.guardarAlumno(alu);
        }
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR. Ingrese los datos correctos en TODOS los campos.");
        }
        
        limpiarCampos();
        //JOptionPane.showMessageDialog(null, "Se registro un nuevo Alumno: "+dni+" "+estado+" "+fNac);

    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        
        try{
        AlumnoData aluData = new AlumnoData();
        Alumno nuevo = aluData.buscarAlumnoPorDni(Integer.parseInt(jTDni.getText()));
        jTApellido.setText(nuevo.getApellido());
        jTNombre.setText(nuevo.getNombre());
        jCheckBoxEstado.setSelected(nuevo.isEstado());
        jDateFechaN.setDate(Date.valueOf(nuevo.getFechaNacimiento()));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR por favor reintente poniendo los NUMEROS correctos.");
            limpiarCampos();
        }

    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        
        try{
        AlumnoData aluData = new AlumnoData();
        Alumno nuevo = aluData.buscarAlumnoPorDni(Integer.parseInt(jTDni.getText()));
        aluData.eliminarAlumno(nuevo.getIdAlumno());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR por favor ingrese el DNI correcto para Borrarlo.");
        }
        
        limpiarCampos();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
        
        try{
        AlumnoData aluData = new AlumnoData();
        Alumno nuevo = aluData.buscarAlumnoPorDni(Integer.parseInt(jTDni.getText()));
        nuevo.setApellido(jTApellido.getText());
        nuevo.setNombre(jTNombre.getText());
        nuevo.setFechaNacimiento(jDateFechaN.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        aluData.modificarAlumno(nuevo);
        limpiarCampos();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR por favor reintente ingresando el DNI correcto.");
            
        }
        
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTApellidoKeyTyped
        // TODO add your handling code here:
        
        int key = evt.getKeyChar();
        
        boolean mayus= key >=65 && key <=90;
        boolean minus= key >=97 && key <=122;
        
        if(!(minus || mayus)){
            evt.consume();
        }
        
    }//GEN-LAST:event_jTApellidoKeyTyped

    private void jTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyTyped
        // TODO add your handling code here:
        
        int key = evt.getKeyChar();
        
        boolean mayus= key >=65 && key <=90;
        boolean minus= key >=97 && key <=122;
        
        if(!(minus || mayus)){
            evt.consume();
        }
        
    }//GEN-LAST:event_jTNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JCheckBox jCheckBoxEstado;
    private com.toedter.calendar.JDateChooser jDateFechaN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
    private void limpiarCampos() {
        jTDni.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jCheckBoxEstado.setSelected(false);
        jDateFechaN.repaint();
    }

    
}
