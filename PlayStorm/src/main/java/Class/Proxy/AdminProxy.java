package Class.Proxy;

import Interfaces.IntAdmin;
import Class.Administrator;

/**
 *
 * @author jorge
 */
public class AdminProxy implements IntAdmin {

    private Administrator realAdmin;

    /**
     *
     * @param email
     */
    @Override
    public void deleteClient(String email) {
        if (realAdmin == null) {
            realAdmin = Administrator.getInstance();
        }
        realAdmin.deleteClient(email);
    }

    /**
     *
     * @param email
     */
    @Override
    public void deleteCompany(String email) {
        if (realAdmin == null) {
            realAdmin = Administrator.getInstance();
        }
        realAdmin.deleteCompany(email);
    }

    /**
     *
     * @param id
     */
    @Override
    public void deleteProduct(int id) {
        if (realAdmin == null) {
            realAdmin = Administrator.getInstance();
        }
        realAdmin.deleteProduct(id);
    }

}
