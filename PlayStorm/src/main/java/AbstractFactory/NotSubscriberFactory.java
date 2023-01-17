/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author jorge
 */
public class NotSubscriberFactory implements UserFactory{

    @Override
    public Company createCompany() {
        return new NotSubscriberCompany();
    }

    @Override
    public Client createClient() {
        return new NotSubscriberClient();
    }
    
}
