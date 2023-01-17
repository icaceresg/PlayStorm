package Class;

public class FactoryUser {

    private int selection;

    public User crearUsuario(int selec, String name, String email, String password, String site, String cif, String lastName, String creditCard, String phone, boolean subscribe) {
        switch (selec) {
            case 0 -> {
                Client client = new Client(lastName, site, creditCard, phone, name, email, password);
                System.out.println(lastName);
                System.out.println(client.getLastName());
                System.out.println(client.getEmail());
                return client;
            }
            case 1 -> {
                return new Company(name, email, password, site, cif, subscribe);
            }
            default -> {
                return null;
            }
        }
    }
}
