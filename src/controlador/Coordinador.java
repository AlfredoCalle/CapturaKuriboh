package controlador;

import modelo.Logica;
import vista.Juego1Jugador;
import vista.Login;

/**
 *
 * @author Alfredo Calle Aguilar
 */
public class Coordinador {
    
    private Login ventanaLogin;
    private Logica logica;
    private Juego1Jugador ventana1jugador;
    
    public void setVentanaLogin(Login login) {
        this.ventanaLogin = login;
    }
    
    public void setLogica(Logica logica) {
        this.logica = logica;
    }

    void setVentana1Jugador(Juego1Jugador ventana1jugador) {
        this.ventana1jugador = ventana1jugador;
    }

    public void jugar() {
        ventanaLogin.dispose();
        ventana1jugador.setVisible(true);
    }
    
}
