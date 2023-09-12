/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_grupo_87.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad_grupo_87.Entidades.Alumno;

/**
 *
 * @author Discar
 */
public class AlumnoData {
    
    private Connection con=null;
    
    public AlumnoData(){
        
        con=Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        
        
            String sql = "INSERT INTO alumno ( dni, apellido, nombre, fechaNacimiento, estado) VALUES ( ?, ?, ?, ?, ?)";
            
        try {    
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se guardo el nuevo Alumno");
                
            }
                ps.close(); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ ex.getMessage());
        }
    }
    
    public void modificarAlumno(Alumno alumno){
        String sql="UPDATE alumno SET dni=?, apellido=?,nombre=?,fechaNacimiento=? WHERE idAlumno=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Se modifico con exito.");
                
            }else{
                JOptionPane.showMessageDialog(null, "No se encontra el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ ex.getMessage());
        }
    }
    
    public void eliminarAlumno(int id){
        
        String sql="UPDATE alumno SET estado=0 WHERE idAlumno=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Se elimino el alumno");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ ex.getMessage());
        }
    }
    
    public Alumno buscarAlumno(int id){
        
        String sql="Select dni,apellido,nombre,fechaNacimiento from alumno where id_alumno=? AND estado=true";
        Alumno alu=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                alu=new Alumno();
                alu.setIdAlumno(id);
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setEstado(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro Alumno con esa ID");
                
            }
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ ex.getMessage());
        }
        return alu;
        
    }
    
    public Alumno buscarAlumnoPorDNI(int dni){
        
        String sql="Select id_alumno,apellido,nombre,fechaNacimiento from alumno where dni=? AND estado=true";
        Alumno alu=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                alu=new Alumno();
                alu.setIdAlumno(rs.getInt("id_alumno"));
                alu.setDni(dni);
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setEstado(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro Alumno con esa ID");
                
            }
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ ex.getMessage());
        }
        return alu;
        
    }
    
    public List<Alumno> listarAlumnos(){
        String sql="Select id_alumno, apellido,nombre,fechaNacimiento from alumno where estado=true";
        ArrayList<Alumno> listAlu=new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                Alumno alu = new Alumno();
                alu.setIdAlumno(rs.getInt("id_alumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setEstado(true);
                listAlu.add(alu);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ ex.getMessage());
        }
        return listAlu;
    }
    
    
    
    
}
