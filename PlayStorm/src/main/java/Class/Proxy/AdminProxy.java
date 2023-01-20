package Class.Proxy;

import Class.Administrator;
import Class.Product;

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
    public void deleteProduct(Product product) {
        if (realAdmin == null) {
            realAdmin = Administrator.getInstance();
        }
        realAdmin.deleteProduct(product);
    }

}
