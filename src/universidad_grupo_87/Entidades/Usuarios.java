/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_grupo_87.Entidades;

/**
 *
 * @author gabriel925
 */
public class Usuarios {
    private String usuario;
    private String contraseña;
    private boolean admin;

    public Usuarios(String usuario, String contraseña, boolean admin) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.admin = admin;
    }
    public Usuarios (){}
    
    public Usuarios(boolean admin) {
        this.admin = admin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
}
