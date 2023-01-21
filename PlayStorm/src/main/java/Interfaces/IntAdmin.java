package Interfaces;

import Class.Product;

public interface IntAdmin {

    void deleteClient(String email);

    void deleteCompany(String email);

    void deleteProduct(int Id);
}
