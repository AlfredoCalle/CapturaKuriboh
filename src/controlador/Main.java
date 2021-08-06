package controlador;

import modelo.Logica;
import vista.Login;

/**
 *
 * @author Alfredo Calle Aguilar
 */
public class Main {
    
    public static void main(String[] args) {
        Login ventanaLogin = new Login();
        Logica logica = new Logica();
        Coordinador coordinador = new Coordinador();
        
        ventanaLogin.setCoordinador(coordinador);
        logica.setCoordinador(coordinador);
        
        coordinador.setVentanaLogin(ventanaLogin);
        coordinador.setLogica(logica);
        
        ventanaLogin.setVisible(true);
        
        
    }
    
}
