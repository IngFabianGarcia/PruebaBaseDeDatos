/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author umg
 */
public class conexion {
    Connection conexion;
    public Connection Conectar(String user, String contra){
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String nombre_servidor= "168.234.74.80";
            String puerto = "1521";
            String sid = "umg";
            String url ="jdbc:oracle:thin:@"+nombre_servidor+":"+puerto+":"+sid;
            String url_real="jdbc:oracle:thin:@:168.234.74.80:1521:umg";
            
            conexion = DriverManager.getConnection(url_real,user,contra);
                
            JOptionPane.showMessageDialog(null, "Conexion Correcta");
            
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Conexion Correcta");
        }
        
        return conexion;
       
    }
}
