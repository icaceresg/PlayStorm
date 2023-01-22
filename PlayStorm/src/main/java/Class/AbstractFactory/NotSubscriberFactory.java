package Class.AbstractFactory;

import Class.AbstractFactory.TemplateMethod.NotSubscriberClient;
import Class.AbstractFactory.TemplateMethod.NotSubscriberCompany;
import Interfaces.*;

public class NotSubscriberFactory implements UserFactory {

    @Override
    public IntCompany createCompany(String name, String email, String password, String site, String cif) {
        return new NotSubscriberCompany(name, email, password, site, cif);
    }

    @Override
    public IntClient createClient(String name, String email, String password, String lastName, String site, String creditCard, String phone, String birthday) {
        return new NotSubscriberClient(name, email, password, lastName, site, creditCard, phone, birthday);
    }

}
