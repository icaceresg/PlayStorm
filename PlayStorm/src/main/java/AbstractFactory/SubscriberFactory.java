/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author jorge
 */
public class SubscriberFactory implements UserFactory {

    @Override
    public IntCompany createCompany(String name, String email, String password, String site, String cif, boolean subscribe) {
        return new Company(name, email, password, site, cif, subscribe);
    }

    @Override
    public IntClient createClient(String name, String email, String password, String lastName, String site, String creditCard, String phone) {
        return new Client(name, email, password, lastName, site, creditCard, phone);
    }

}
