package Interfaces;

import javax.swing.JFrame;

/**
 *
 * Interfaz que realiza el LogOut de un cliente para el patrón Command
 */
public interface IntLogOut {

    /**
     * Método a implementar
     * @param vista
     */
    void logOut(JFrame vista);

    /**
     * Método a implementar
     */
    public void logOutUser();
}
