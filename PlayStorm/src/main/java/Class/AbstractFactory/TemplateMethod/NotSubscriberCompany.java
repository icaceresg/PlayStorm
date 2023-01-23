package Class.AbstractFactory.TemplateMethod;

import Class.Company;

/**
 *
 * @author jorge
 */
public class NotSubscriberCompany extends Company {

    /**
     *
     * @param name
     * @param email
     * @param password
     * @param site
     * @param cif
     */
    public NotSubscriberCompany(String name, String email, String password, String site, String cif) {
        super(name, email, password, site, cif);
    }

}
