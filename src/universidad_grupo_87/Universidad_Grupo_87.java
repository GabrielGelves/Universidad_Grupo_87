/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_grupo_87;

import java.time.LocalDate;
import universidad_grupo_87.AccesoADatos.AlumnoData;
import universidad_grupo_87.AccesoADatos.Conexion;
import universidad_grupo_87.Entidades.Alumno;

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
        Alumno maria=new Alumno(45678912,"Lopez","Maria",LocalDate.of(1990, 12, 12),true);
        AlumnoData AD=new AlumnoData();
        
        
        AD.guardarAlumno(maria);
        
        
    }
    
}
