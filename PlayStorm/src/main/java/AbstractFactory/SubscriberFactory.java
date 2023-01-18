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
    public Company createCompany(boolean par) {
        return new SubscriberCompany(par);
    }

    @Override
    public Client createClient(boolean par) {
        return new SubscriberClient(par);
    }

}
