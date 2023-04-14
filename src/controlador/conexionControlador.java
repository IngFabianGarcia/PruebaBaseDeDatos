/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.conexion;
import vista.*;


/**
 *
 * @author umg
 */
public class conexionControlador implements ActionListener{
    frmLogin VistaLogin;
    frmPrincipal VistaPrincipal;
    conexion conexion;

    public conexionControlador(frmLogin VistaLogin, frmPrincipal VistaPrincipal, conexion conexion) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.conexion = conexion;
        
        this.VistaLogin.btnIniciarSesion.addActionListener(this);
        this.VistaPrincipal.btnConectar.addActionListener(this);
        
        this.VistaPrincipal.setVisible(true);
        this.VistaPrincipal.setLocationRelativeTo(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnConectar){
            this.VistaLogin.setVisible(true);
            this.VistaLogin.setLocationRelativeTo(null);
        }
        
        if(e.getSource()== this.VistaLogin.btnIniciarSesion){
            this.conexion.Conectar(this.VistaLogin.txtUsuario.getText(), this.VistaLogin.txtContra.getText());
            
        }
        
    }
    
    
}
