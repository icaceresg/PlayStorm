package Class.AbstractFactory;

import Class.AbstractFactory.TemplateMethod.SubscriberClient;
import Class.AbstractFactory.TemplateMethod.SubscriberCompany;
import Interfaces.UserFactory;
import Interfaces.IntClient;
import Interfaces.IntCompany;

/**
 *
 * @author jorge
 */
public class SubscriberFactory implements UserFactory {

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
        return new SubscriberCompany(name, email, password, site, cif);
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
        return new SubscriberClient(name, email, password, lastName, site, creditCard, phone, birthday);
    }

}
