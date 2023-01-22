package Class.Proxy;

import Interfaces.IntAdmin;
import Class.Administrator;

public class AdminProxy implements IntAdmin {

    private Administrator realAdmin;

    @Override
    public void deleteClient(String email) {
        if (realAdmin == null) {
            realAdmin = Administrator.getInstance();
        }
        realAdmin.deleteClient(email);
    }

    @Override
    public void deleteCompany(String email) {
        if (realAdmin == null) {
            realAdmin = Administrator.getInstance();
        }
        realAdmin.deleteCompany(email);
    }

    @Override
    public void deleteProduct(int id) {
        if (realAdmin == null) {
            realAdmin = Administrator.getInstance();
        }
        realAdmin.deleteProduct(id);
    }

}
