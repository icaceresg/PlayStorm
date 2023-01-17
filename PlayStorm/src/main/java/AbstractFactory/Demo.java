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
    private static Application configureApplication() {
        Application app;
        UserFactory factory;
        String tipo = "Suscrito";
        if (tipo.equals("Suscrito")) {
            factory = new SubscriberFactory();
        } else {
            factory = new NotSubscriberFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.SetandGetNames();
    }
}
