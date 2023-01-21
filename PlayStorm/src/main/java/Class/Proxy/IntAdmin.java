package Class.Proxy;

import Class.Product;

public interface IntAdmin {

    void deleteClient(String email);

    void deleteCompany(String email);

    void deleteProduct(int Id);
}
