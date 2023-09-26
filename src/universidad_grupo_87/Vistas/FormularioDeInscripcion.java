/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_grupo_87.Vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad_grupo_87.AccesoADatos.AlumnoData;
import universidad_grupo_87.AccesoADatos.InscripcionData;
import universidad_grupo_87.Entidades.Alumno;
import universidad_grupo_87.Entidades.Materia;
import universidad_grupo_87.Entidades.Inscripcion;

/**
 *
 * @author psg_7
 */
public class FormularioDeInscripcion extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel(){
    
    public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
        
    /**
     * Creates new form FormularioDeInscripcion
     */
    public FormularioDeInscripcion(){
        initComponents();
        armarCabecera();
        cargarCombo();
            }
     
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnoSeleccionado = new javax.swing.JComboBox<>();
        jrbMateriasInscriptas = new javax.swing.JRadioButton();
        jrbMateriasNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVistaInscripciones = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnularInscripcion = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setText("Seleccione un alumno:");

        jcbAlumnoSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoSeleccionadoActionPerformed(evt);
            }
        });

        jrbMateriasInscriptas.setText("Materias Inscriptas");
        jrbMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasInscriptasActionPerformed(evt);
            }
        });

        jrbMateriasNoInscriptas.setText("Materias No Inscriptas");
        jrbMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jtVistaInscripciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtVistaInscripciones);

        jbInscribir.setText("Inscribir");
        jbInscribir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInscripcion.setText("Anular Inscripción");
        jbAnularInscripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(jrbMateriasInscriptas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbMateriasNoInscriptas))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(jLabel2)
                            .addGap(50, 50, 50)
                            .addComponent(jcbAlumnoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbInscribir)
                        .addGap(128, 128, 128)
                        .addComponent(jbAnularInscripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMateriasInscriptas)
                    .addComponent(jrbMateriasNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnularInscripcion)
                    .addComponent(jbSalir))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnoSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoSeleccionadoActionPerformed
        // TODO add your handling code here:
        borrarFilas();

        Alumno alumno = (Alumno) jcbAlumnoSeleccionado.getSelectedItem();
        InscripcionData ind = new InscripcionData();
        if (jrbMateriasInscriptas.isSelected()){
            for (Materia ins : ind.obtenerMateriasCursadas(alumno.getIdAlumno())) {
            modelo.addRow(new Object[]{ins.getIdMateria(), ins.getNombre(), ins.getAño()});
        } 
        }else {
                for (Materia ins : ind.obtenerMateriasNOCursadas(alumno.getIdAlumno())) {
            modelo.addRow(new Object[]{ins.getIdMateria(), ins.getNombre(), ins.getAño()});
                
                }
            }
    }//GEN-LAST:event_jcbAlumnoSeleccionadoActionPerformed

    private void jrbMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasInscriptasActionPerformed
        // TODO add your handling code here:
     botones.add(jrbMateriasInscriptas);
     
     botones.add(jrbMateriasNoInscriptas);
     
     if(jrbMateriasInscriptas.isSelected()){
         
         borrarFilas();
         
         cargarTabla();
     
     }else if (jrbMateriasNoInscriptas.isSelected()){ 
         
         borrarFilas();
         
         cargarTablaNoCursadas();
         
     }
    }//GEN-LAST:event_jrbMateriasInscriptasActionPerformed

    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
        // TODO add your handling code here:
    if (jrbMateriasInscriptas.isSelected()){
        
      int filaS=jtVistaInscripciones.getSelectedRow();
    int idMateria = (Integer)jtVistaInscripciones.getValueAt(filaS, 0);
    InscripcionData inscDt = new InscripcionData();
    Alumno alum = (Alumno)jcbAlumnoSeleccionado.getSelectedItem();
    inscDt.borrarInscripcionMateriaAlumno(alum.getIdAlumno(), idMateria);
    if (filaS!=1){
        JOptionPane.showMessageDialog(this, "Inscripción eliminada exitosamente");
        modelo.removeRow(filaS);
    }else{
        JOptionPane.showMessageDialog(this, "Usted no ha seleccionado la materia que desea anular");
   
    }
    }else{
        JOptionPane.showMessageDialog(this, "Por favor seleccione una materia en la que esté inscripta");
    }
    }//GEN-LAST:event_jbAnularInscripcionActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
        if (jrbMateriasNoInscriptas.isSelected()){
        Alumno alu = (Alumno)jcbAlumnoSeleccionado.getSelectedItem();
        InscripcionData ind=new InscripcionData();
         int filaS=jtVistaInscripciones.getSelectedRow();
         int idMateria = (Integer)jtVistaInscripciones.getValueAt(filaS, 0);
         String nombre = (String)jtVistaInscripciones.getValueAt(filaS, 1);
         int año = (Integer)jtVistaInscripciones.getValueAt(filaS, 2);
         Materia mater = new Materia(idMateria, nombre, año, true);
         Inscripcion ins = new Inscripcion(alu, mater, 0);
         ind.guardarInscripcion(ins);
         if (filaS!=1){
        JOptionPane.showMessageDialog(this, "Inscripción exitosa");
        modelo.removeRow(filaS);
    }else{
        JOptionPane.showMessageDialog(this, "Usted no ha seleccionado la materia que desea inscribir");
   
    }
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jrbMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasNoInscriptasActionPerformed
        // TODO add your handling code here:
      if(jrbMateriasInscriptas.isSelected()){
         
         borrarFilas();
         
         cargarTabla();
     
     }else if (jrbMateriasNoInscriptas.isSelected()){ 
         
         borrarFilas();
         
         cargarTablaNoCursadas();
         
     }    
    }//GEN-LAST:event_jrbMateriasNoInscriptasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnoSeleccionado;
    private javax.swing.JRadioButton jrbMateriasInscriptas;
    private javax.swing.JRadioButton jrbMateriasNoInscriptas;
    private javax.swing.JTable jtVistaInscripciones;
    // End of variables declaration//GEN-END:variables

private void cargarCombo(){
    
    AlumnoData ad = new AlumnoData();
    for (Alumno alumno : ad.listarAlumnos()){
        jcbAlumnoSeleccionado.addItem(alumno);
        }
}

private void armarCabecera(){
    modelo.addColumn("Código");
    modelo.addColumn("Nombre");
    modelo.addColumn("Año");
    jtVistaInscripciones.setModel(modelo);
}

 public void borrarFilas() {
        int x = jtVistaInscripciones.getRowCount() - 1;

        for (int i = x; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }

private void cargarTabla() {
        borrarFilas();

        Alumno alumno = (Alumno) jcbAlumnoSeleccionado.getSelectedItem();
        InscripcionData ind = new InscripcionData();

        for (Materia ins : ind.obtenerMateriasCursadas(alumno.getIdAlumno())) {
            modelo.addRow(new Object[]{ins.getIdMateria(), ins.getNombre(), ins.getAño()});
        }
    }
private void cargarTablaNoCursadas() {
        borrarFilas();

        Alumno alumno = (Alumno) jcbAlumnoSeleccionado.getSelectedItem();
        InscripcionData ind = new InscripcionData();

        for (Materia ins : ind.obtenerMateriasNOCursadas(alumno.getIdAlumno())) {
            modelo.addRow(new Object[]{ins.getIdMateria(), ins.getNombre(), ins.getAño()});
        }
    }

}



