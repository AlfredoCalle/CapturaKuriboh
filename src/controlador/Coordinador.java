package controlador;

import modelo.Logica;
import vista.Login;

/**
 *
 * @author Alfredo Calle Aguilar
 */
public class Coordinador {
    
    private Login ventanaLogin;
    private Logica logica;
    
    public void setVentanaLogin(Login login) {
        this.ventanaLogin = login;
    }
    
    public void setLogica(Logica logica) {
        this.logica = logica;
    }
    
}
