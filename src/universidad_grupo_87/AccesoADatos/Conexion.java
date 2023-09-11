/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_grupo_87.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel925
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="universidad";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){
        
    }
    
    public static Connection getConexion(){
        if(connection == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                Connection con = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error en la carga de Driver "+ ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error en la conexion con la base de datos "+ ex.getMessage());
            }
            
        }
        return connection;
    }
}
