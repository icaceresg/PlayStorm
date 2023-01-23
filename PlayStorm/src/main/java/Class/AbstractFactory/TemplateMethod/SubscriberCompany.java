package Class.AbstractFactory.TemplateMethod;

import Class.Company;

/**
 *
 * @author jorge
 */
public class SubscriberCompany extends Company {

    /**
     *
     * @param name
     * @param email
     * @param password
     * @param site
     * @param cif
     */
    public SubscriberCompany(String name, String email, String password, String site, String cif) {
        super(name, email, password, site, cif);
    }

}
