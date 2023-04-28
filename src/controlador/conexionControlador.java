/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.conexion;
import modelo.personaModel;
import vista.*;


/**
 *
 * @author umg
 */
public class conexionControlador implements ActionListener{
    frmLogin VistaLogin;
    frmPrincipal VistaPrincipal;
    frmPersonas vistaPersonas;
    personaModel modeloPersona;
    conexion conexion;

    public conexionControlador(frmLogin VistaLogin, frmPrincipal VistaPrincipal, frmPersonas vistaPersonas, personaModel modeloPersona, conexion conexion) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.vistaPersonas = vistaPersonas;
        this.modeloPersona = modeloPersona;
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
            if(conexion !=null){
                this.vistaPersonas.dispose();
                this.vistaPersonas.btnAgregarPersona.addActionListener(this);
                this.vistaPersonas.setLocationRelativeTo(null);
                this.vistaPersonas.setVisible(true);
            }
        }
        
        if(e.getSource() == e){
            this.modeloPersona.GuardarPersona(this.vistaPersonas.txtApellidos.getText(), 
                    this.vistaPersonas.txtNombre.getText(), Integer.parseInt(this.vistaPersonas.txtTelefono.getText()));
        }
        
    }
    
    
}
