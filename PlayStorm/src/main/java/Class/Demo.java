package Class;

import Interfaces.IntClient;
import Interfaces.IntCompany;
import Interfaces.IntUser;
import Interfaces.UserFactory;
/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static IntClient configureApplicationClient(String tipo) {
        SubscriberFactory subscriberFactory = new SubscriberFactory();
        NotSubscriberFactory notSubscriberFactory = new NotSubscriberFactory();
        IntClient client;
        if (tipo.equals("Suscrito")) {
            client = subscriberFactory.createClient("Jorge", "jorge.fer.raez@gmail.com", "contraseña", "Fernandez", "Site", "1234567891234567", "918710203");
            return client;
        }
        else {
            client = notSubscriberFactory.createClient("Jorge", "jorge.fer.raez@gmail.com", "contraseña", "Fernandez", "Site", "1234567891234567", "918710203");
    }
    return client;
}

private static IntCompany configureApplicationCompany(String tipo) {
        SubscriberFactory subscriberFactory = new SubscriberFactory();
        NotSubscriberFactory notSubscriberFactory = new NotSubscriberFactory();
        IntCompany company;
        if (tipo.equals("Suscrito")) {
            company = subscriberFactory.createCompany("Inditex", "email", "contraseña", "Site", "12354", true);
            return company;
        }
        else {
            company = notSubscriberFactory.createCompany("Inditex", "email", "contraseña", "Site", "12354", false);
    }
    return company;
    }

    public static void main(String[] args) {
        IntClient client = configureApplicationClient("No Suscrito");
        System.out.println("El nombre del cliente es: " + client.getName() + " y su suscripcion es: ");

        IntCompany company = configureApplicationCompany("Suscrito");
        System.out.println("El nombre de la compañia es: " + company.getName() + " y su suscripcion es: " + company.isSubscribe());

    }
}
