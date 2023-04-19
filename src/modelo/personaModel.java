
package modelo;

import java.sql.*;
import modelo.conexion;
/**
 *
 * @author Fabian
 */
public class personaModel {
    
    private String apellidos;
    private String nombre;
    private int telefono;
    Connection myConexion;

    public personaModel(String apellidos, String nombre, int telefono) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    
    
    

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void GuardarPersona(){
        conexion nuevaConexion = new conexion();
        this.myConexion= nuevaConexion.Conectar(nombre, nombre);
    }
}
