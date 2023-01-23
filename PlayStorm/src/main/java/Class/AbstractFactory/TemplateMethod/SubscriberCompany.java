package Class.AbstractFactory.TemplateMethod;

import Class.Company;

/**
 * Clase que extiende de la empresa y crea el objeto en cuestión
 */
public class SubscriberCompany extends Company {

    /**
     * Crea el company suscriptor
     *
     * @param name, nombre de la empresa
     * @param email, correo de la empresa
     * @param password, contraseña de la empresa
     * @param site, localización de la empresa
     * @param cif, CIF de la empresa
     */
    public SubscriberCompany(String name, String email, String password, String site, String cif) {
        super(name, email, password, site, cif);
    }

}
