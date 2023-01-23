package Class.AbstractFactory;

import Class.AbstractFactory.TemplateMethod.NotSubscriberClient;
import Class.AbstractFactory.TemplateMethod.NotSubscriberCompany;
import Interfaces.*;

/**
 * Clase que implementa la interfaz UserFactory para el patron AbstractFactory
 */
public class NotSubscriberFactory implements UserFactory {

    /**
     * Crea la empresa cuando no está suscrita
     *
     * @param name, nombre de la empresa
     * @param email, correo de la empresa
     * @param password, contraseña de la empresa
     * @param site, localización de la empresa
     * @param cif, CIF de la empresa
     * @return NotSubscriberCompany, empresa creada
     */
    @Override
    public IntCompany createCompany(String name, String email, String password, String site, String cif) {
        return new NotSubscriberCompany(name, email, password, site, cif);
    }

    /**
     * Crea el cliente cuando no está suscrito
     *
     * @param name, nombre del cliente
     * @param email, correo del cliente
     * @param password, contraseña del cliente
     * @param lastName, apellido del cliente
     * @param site, localización del cliente
     * @param creditCard, tarjeta de crédito del cliente
     * @param phone, teléfono del cliente
     * @param birthday, cumpleaños del cliente
     * @return NotSubscriberClient, cliente creado
     */
    @Override
    public IntClient createClient(String name, String email, String password, String lastName, String site, String creditCard, String phone, String birthday) {
        return new NotSubscriberClient(name, email, password, lastName, site, creditCard, phone, birthday);
    }

}
