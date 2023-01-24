package Class.Command;

import Class.User;
import GUI.Login;
import Interfaces.IntLogOut;
import javax.swing.JFrame;

/**
 * Clase que implementa la interfaz IntLogOut y sirve para el patrón Command
 */
public class LogoutCommand implements IntLogOut {

    /**
     * Método que se encarga de cerrar sesión
     *
     * @param vista, vista actual
     */
    @Override
    public void logOut(JFrame vista) {
        Login login = new Login();
        login.setVisible(true);
        vista.dispose();

        logOutUser();
    }

    /**
     * Quita el usuario activo
     */
    @Override
    public void logOutUser() {
        User.activeUser.clear();
    }

}
