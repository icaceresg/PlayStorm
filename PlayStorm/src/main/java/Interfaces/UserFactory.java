package Interfaces;

/**
 * Interfaz para el patrón Abstract Factory
 */
public interface UserFactory {

    /**
     * Crear una compañía
     *
     * @param name
     * @param email
     * @param password
     * @param site
     * @param cif
     * @return
     */
    IntCompany createCompany(String name, String email, String password, String site, String cif);

    /**
     * Crear un cliente
     *
     * @param name
     * @param email
     * @param password
     * @param lastName
     * @param site
     * @param creditCard
     * @param phone
     * @param birthday
     * @return
     */
    IntClient createClient(String name, String email, String password, String lastName, String site, String creditCard, String phone, String birthday);

}
