package Interfaces;

/**
 *
 * @author jorge
 */
public interface UserFactory {

    /**
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
