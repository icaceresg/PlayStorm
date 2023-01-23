package Class.AbstractFactory;

import Class.AbstractFactory.TemplateMethod.NotSubscriberClient;
import Class.AbstractFactory.TemplateMethod.NotSubscriberCompany;
import Interfaces.*;

/**
 *
 * @author jorge
 */
public class NotSubscriberFactory implements UserFactory {

    /**
     *
     * @param name
     * @param email
     * @param password
     * @param site
     * @param cif
     * @return
     */
    @Override
    public IntCompany createCompany(String name, String email, String password, String site, String cif) {
        return new NotSubscriberCompany(name, email, password, site, cif);
    }

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
    @Override
    public IntClient createClient(String name, String email, String password, String lastName, String site, String creditCard, String phone, String birthday) {
        return new NotSubscriberClient(name, email, password, lastName, site, creditCard, phone, birthday);
    }

}
