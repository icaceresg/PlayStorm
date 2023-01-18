package AbstractFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Client configureApplicationClient(String tipo) {
        SubscriberFactory subscriberFactory = new SubscriberFactory();
        NotSubscriberFactory notSubscriberFactory = new NotSubscriberFactory();
        Client client;
        if (tipo.equals("Suscrito")) {
            client = subscriberFactory.createClient(true);
            return client;
        }
        else {
            client = notSubscriberFactory.createClient(false);
    }
    return client;
}

private static Company configureApplicationCompany(String tipo) {
        SubscriberFactory subscriberFactory = new SubscriberFactory();
        NotSubscriberFactory notSubscriberFactory = new NotSubscriberFactory();
        Company company;
        if (tipo.equals("Suscrito")) {
            company = subscriberFactory.createCompany(true);
            return company;
        }
        else {
            company = notSubscriberFactory.createCompany(false);
    }
    return company;
    }

    public static void main(String[] args) {
        Client client = configureApplicationClient("No Suscrito");
        client.setName("Raul");
        System.out.println("El nombre del cliente es: " + client.getName() + " y su suscripcion es: " + client.isPar());

        Company company = configureApplicationCompany("No Suscrito");
        company.setName("Amazon");
        System.out.println("El nombre de la compañia es: " + company.getName() + " y su suscripcion es: " + company.isPar());

    }
}
