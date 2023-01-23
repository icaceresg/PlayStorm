package Class.AbstractFactory.TemplateMethod;

import Class.Client;

/**
 *
 * @author jorge
 */
public class SubscriberClient extends Client {

    /**
     *
     * @param name
     * @param email
     * @param password
     * @param lastName
     * @param location
     * @param creditCard
     * @param telephone
     * @param birthday
     */
    public SubscriberClient(String name, String email, String password, String lastName, String location, String creditCard, String telephone, String birthday) {
        super(name, email, password, lastName, location, creditCard, telephone, birthday);
    }

}
