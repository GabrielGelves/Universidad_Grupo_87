/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_grupo_87;

import java.time.LocalDate;
import universidad_grupo_87.AccesoADatos.AlumnoData;
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
        AlumnoData Ad=new AlumnoData();
        Alumno maria=new Alumno(1,12345678,"Lopez","Marina",LocalDate.of(1995, 12, 12),true);
        
        //Ad.guardarAlumno(maria);
        //Ad.modificarAlumno(maria);
        
    }
    
}
