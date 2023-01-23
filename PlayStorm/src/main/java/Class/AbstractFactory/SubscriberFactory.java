package Class.AbstractFactory;

import Class.AbstractFactory.TemplateMethod.SubscriberClient;
import Class.AbstractFactory.TemplateMethod.SubscriberCompany;
import Interfaces.UserFactory;
import Interfaces.IntClient;
import Interfaces.IntCompany;

/**
 * Clase que implementa la interfaz UserFactory para el patron AbstractFactory
 */
public class SubscriberFactory implements UserFactory {

    /**
     * Crea la empresa cuando está suscrita
     *
     * @param name, nombre de la empresa
     * @param email, correo de la empresa
     * @param password, contraseña de la empresa
     * @param site, localización de la empresa
     * @param cif, CIF de la empresa
     * @return SubscriberCompany, empresa creada
     */
    @Override
    public IntCompany createCompany(String name, String email, String password, String site, String cif) {
        return new SubscriberCompany(name, email, password, site, cif);
    }

    /**
     * Crea el cliente cuando está suscrito
     *
     * @param name, nombre del cliente
     * @param email, correo del cliente
     * @param password, contraseña del cliente
     * @param lastName, apellido del cliente
     * @param site, localización del cliente
     * @param creditCard, tarjeta de crédito del cliente
     * @param phone, teléfono del cliente
     * @param birthday, cumpleaños del cliente
     * @return SubscriberClient, cliente creado
     */
    @Override
    public IntClient createClient(String name, String email, String password, String lastName, String site, String creditCard, String phone, String birthday) {
        return new SubscriberClient(name, email, password, lastName, site, creditCard, phone, birthday);
    }

}
