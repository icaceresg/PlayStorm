/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Interfaces.*;

public class NotSubscriberFactory implements UserFactory {

    @Override
    public IntCompany createCompany(String name, String email, String password, String site, String cif, boolean subscribe) {
        return new NotSubscriberCompany(name, email, password, site, cif, subscribe);
    }

    @Override
    public IntClient createClient(String name, String email, String password, String lastName, String site, String creditCard, String phone) {
        return new NotSubscriberClient(name, email, password, lastName, site, creditCard, phone);
    }

}
