package Interfaces;

/**
 *
 * Interfaz del administrador para usar el patrón Proxy
 */
public interface IntAdmin {

    /**
     * Borra un cliente de la base de datos, según su email
     * @param email
     */
    void deleteClient(String email);

    /**
     * Borra una empresa de la base de datos, según su email
     * @param email
     */
    void deleteCompany(String email);

    /**
     * Borra un producto de la base de datos, según su id
     * @param Id
     */
    void deleteProduct(int Id);
}
