/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.AbstractFactory.TemplateMethod;

import Class.Client;

/**
 *
 * @author jorge
 */
public class NotSubscriberClient extends Client {

    public NotSubscriberClient(String name, String email, String password, String lastName, String site, String creditCard, String phone, String birthday) {
        super(name, email, password, lastName, site, creditCard, phone, birthday);
    }
}
