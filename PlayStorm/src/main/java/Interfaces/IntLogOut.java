package Interfaces;

import javax.swing.JFrame;

/**
 *
 * Interfaz que realiza el LogOut de un cliente para el patrón Command
 */
public interface IntLogOut {

    /**
     *
     * @param vista
     */
    void logOut(JFrame vista);

    /**
     *
     */
    public void logOutUser();
}
