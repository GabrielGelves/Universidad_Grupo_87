/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_grupo_87;

import java.time.LocalDate;
import universidad_grupo_87.AccesoADatos.AlumnoData;
import universidad_grupo_87.AccesoADatos.InscripcionData;
import universidad_grupo_87.AccesoADatos.MateriaData;
import universidad_grupo_87.Entidades.Alumno;
import universidad_grupo_87.Entidades.Inscripcion;
import universidad_grupo_87.Entidades.Usuarios;
import universidad_grupo_87.Entidades.Materia;

/**
 *
 * @author gabriel925
 */
public class Universidad_Grupo_87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Conexion.getConexion();
        //Login alum = new Login("AlumnoULP","Alum1234",false);
        //Login admin = new Login("AdministradorULP","Admin1234",true);
        AlumnoData Ad = new AlumnoData();
        Alumno maria = new Alumno(6, 12345678, "Lopez", "Marina", LocalDate.of(1995, 12, 12), true);
        MateriaData MD = new MateriaData();
        Materia mate = new Materia(2, "Calculo 2", 2, true);
        
        InscripcionData ide = new InscripcionData();
        Inscripcion insc = new Inscripcion( maria ,mate, 7.8);
        
        //ide.guardarInscripcion(insc);
        //ide.actualizarNota(1, 3, 8.3);
        //ide.borrarInscripcionMateriaAlumno(6, 2);
        
//        for (Inscripcion obtenerInscripcione : ide.obtenerInscripciones()) {
//            System.out.println(obtenerInscripcione.toString());
//            
//        }

//        for (Inscripcion obtenerInscripcione : ide.obtenerInscripcionesPorAlumno(1)) {
//            System.out.println(obtenerInscripcione.toString());
//            
//        }

//        for (Materia x : ide.obtenerMateriasCursadas(1)) {
//            System.out.println(x.toString());
//            
//        }

//        for (Alumno x : ide.obtenerAlumnoXMateria(4)) {
//            System.out.println(x.toString());
//            
//        }            
           
        
        for (Materia x : ide.obtenerMateriasNOCursadas(1)) {
            System.out.println(x.toString());
            
        }
          
        
        //Ad.guardarAlumno(maria);
        //Ad.modificarAlumno(maria);
        
        
    }

}
