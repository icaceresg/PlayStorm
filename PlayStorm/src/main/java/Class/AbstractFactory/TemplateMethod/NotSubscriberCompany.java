/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.AbstractFactory.TemplateMethod;

import Class.Company;

/**
 *
 * @author jorge
 */
public class NotSubscriberCompany extends Company {

    public NotSubscriberCompany(String name, String email, String password, String site, String cif, boolean subscribe) {
        super(name, email, password, site, cif, subscribe);
    }

}
