package Class.AbstractFactory.TemplateMethod;

import Class.Company;

public class SubscriberCompany extends Company {

    public SubscriberCompany(String name, String email, String password, String site, String cif) {
        super(name, email, password, site, cif);
    }

}
