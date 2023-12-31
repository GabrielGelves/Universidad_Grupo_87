/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_grupo_87.Vistas;

import javax.swing.JOptionPane;
import universidad_grupo_87.Entidades.Usuarios;

/**
 *
 * @author gabriel925
 */
public class MenuPrincipal extends javax.swing.JFrame {
    Usuarios alum1 = new Usuarios("AlumnoULP", "Alum1234", false);
    Usuarios admin1 = new Usuarios("AdministradorULP", "Admin1234", true);
    Usuarios user = new Usuarios();
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }
    public MenuPrincipal(Usuarios user) {
        initComponents();
        
        this.user = user;
        esAdmin();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmFormularioMateria = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        ManipulacionDeNota = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuAlumnoMateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNIVERSIDAD ULP");

        escritorio.setBackground(new java.awt.Color(0, 0, 204));
        escritorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidad_grupo_87/ImageIcon/ULP.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 255));
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 255));
        jMenuBar1.setToolTipText("UNIVERSIDAD ULP");
        jMenuBar1.setAutoscrolls(true);

        jMenu1.setText("Alumno");

        jMenuItem1.setText("Formulario de Alumno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jmFormularioMateria.setText("Materia");
        jmFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioMateriaActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Formulario de Materia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmFormularioMateria.add(jMenuItem2);

        jMenuBar1.add(jmFormularioMateria);

        jMenu3.setText("Administración");

        jMenuItem3.setText("Manejo de Inscripciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        ManipulacionDeNota.setText("Manipulación de Notas");
        ManipulacionDeNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManipulacionDeNotaActionPerformed(evt);
            }
        });
        jMenu3.add(ManipulacionDeNota);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consulta");

        jMenuAlumnoMateria.setText("Alumnos por Materia");
        jMenuAlumnoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlumnoMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuAlumnoMateria);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAlumnoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlumnoMateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        IFrameConsultaAluMater CAM = new IFrameConsultaAluMater();
        CAM.setVisible(true);
        escritorio.add(CAM);
        escritorio.moveToFront(CAM);
        
    }//GEN-LAST:event_jMenuAlumnoMateriaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        escritorio.repaint();
        JIFrameGAlumno GAlu = new JIFrameGAlumno();
        GAlu.setVisible(true);
        escritorio.add(GAlu);
        escritorio.moveToFront(GAlu);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioMateriaActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jmFormularioMateriaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria fm = new FormularioMateria();
        fm.setVisible(true);
        escritorio.add(fm);
        escritorio.moveToFront(fm);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ManipulacionDeNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManipulacionDeNotaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        CargaDeNotas cn = new CargaDeNotas();
        cn.setVisible(true);
        escritorio.add(cn);
        escritorio.moveToFront(cn);
    }//GEN-LAST:event_ManipulacionDeNotaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeInscripcion finsc= new FormularioDeInscripcion();
        finsc.setVisible(true);
        escritorio.add(finsc);
        escritorio.moveToFront(finsc);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ManipulacionDeNota;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuAlumnoMateria;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jmFormularioMateria;
    // End of variables declaration//GEN-END:variables

public void esAdmin(){
    if(user.isAdmin()){
        JOptionPane.showMessageDialog(null, "Bienvenido Administrador!");
    }else{
        
        this.jMenuItem1.setEnabled(false);
        this.jMenuItem2.setEnabled(false);
        this.ManipulacionDeNota.setEnabled(false);
        
        
    }
    
}

    


}
