package Class.Proxy;

import Interfaces.IntAdmin;
import Class.Administrator;

/**
 *
 * Clase que implementa la interfaz IntAdmin
 */
public class AdminProxy implements IntAdmin {

    /**
     * Declaración de variables
     */
    private Administrator realAdmin;

    /**
     * Eliminar el cliente por correo
     *
     * @param email, correo del cliente
     */
    @Override
    public void deleteClient(String email) {
        if (realAdmin == null) {
            realAdmin = Administrator.getInstance();
        }
        realAdmin.deleteClient(email);
    }

    /**
     * Eliminar la empresa por correo
     *
     * @param email, correo de la empresa
     */
    @Override
    public void deleteCompany(String email) {
        if (realAdmin == null) {
            realAdmin = Administrator.getInstance();
        }
        realAdmin.deleteCompany(email);
    }

    /**
     * Eliminar producto por id
     *
     * @param id, id del producto
     */
    @Override
    public void deleteProduct(int id) {
        if (realAdmin == null) {
            realAdmin = Administrator.getInstance();
        }
        realAdmin.deleteProduct(id);
    }

}
