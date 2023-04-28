import controlador.conexionControlador;
import modelo.conexion;
import modelo.personaModel;
import vista.frmLogin;
import vista.frmPersonas;
import vista.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmLogin VistaLogin = new frmLogin(VistaPrincipal, true);
        frmPersonas vistaPersonas = new frmPersonas(VistaPrincipal, true);
        personaModel modeloPersonas = new personaModel();
        conexion conexion = new conexion();
        conexionControlador controlador = new conexionControlador(VistaLogin, VistaPrincipal, vistaPersonas, modeloPersonas, conexion);
    }
    
}
