package Class.AbstractFactory.TemplateMethod;

import Class.Client;

public class SubscriberClient extends Client {

    public SubscriberClient(String name, String email, String password, String lastName, String location, String creditCard, String telephone, String birthday) {
        super(name, email, password, lastName, location, creditCard, telephone, birthday);
    }

}
