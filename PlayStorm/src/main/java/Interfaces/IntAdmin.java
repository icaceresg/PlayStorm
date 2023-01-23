package Interfaces;

/**
 *
 * @author jorge
 */
public interface IntAdmin {

    /**
     *
     * @param email
     */
    void deleteClient(String email);

    /**
     *
     * @param email
     */
    void deleteCompany(String email);

    /**
     *
     * @param Id
     */
    void deleteProduct(int Id);
}
