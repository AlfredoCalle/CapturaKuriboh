package controlador;

import modelo.Logica;
import vista.Juego1Jugador;
import vista.Login;

/**
 *
 * @author Alfredo Calle Aguilar
 */
public class Main {
    
    public static void main(String[] args) {
        
        Login ventanaLogin = new Login();
        Juego1Jugador ventana1jugador = new Juego1Jugador();
        Logica logica = new Logica();
        Coordinador coordinador = new Coordinador();
        
        // Ventanas
        ventanaLogin.setCoordinador(coordinador);
        ventana1jugador.setCoordinador(coordinador);
        
        // Lógica
        logica.setCoordinador(coordinador);
        
        // Establecer el coordinador de la aplicación
        coordinador.setVentanaLogin(ventanaLogin);
        coordinador.setVentana1Jugador(ventana1jugador);
        coordinador.setLogica(logica);
        
        ventanaLogin.setVisible(true);
        
        
    }
    
}
