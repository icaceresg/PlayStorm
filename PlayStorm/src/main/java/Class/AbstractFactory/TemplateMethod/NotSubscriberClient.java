package Class.AbstractFactory.TemplateMethod;

import Class.Client;

/**
 * Clase que extiende del cliente y crea el objeto en cuestión
 */
public class NotSubscriberClient extends Client {

    /** Crea el cliente no suscriptor
     *
     * @param name, nombre del cliente
     * @param email, correo del cliente
     * @param password, contraseña del cliente
     * @param lastName, apellido del cliente
     * @param location, localización del cliente
     * @param creditCard, tarjeta de crédito del cliente
     * @param telephone, teléfono del cliente
     * @param birthday, cumpleaños del cliente
     */
    public NotSubscriberClient(String name, String email, String password, String lastName, String location, String creditCard, String telephone, String birthday) {
        super(name, email, password, lastName, location, creditCard, telephone, birthday);
    }
}
