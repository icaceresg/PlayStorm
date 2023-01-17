/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author jorge
 */
public class Application {
    private Client client;
    private Company company;
    
    public Application(UserFactory factory){
        client = factory.createClient();
        company = factory.createCompany();
    }
    
    public void SetandGetNames(){
        client.setName("Ivan");
        company.setName("Adri");
        System.out.println(client.getName());
        System.out.println(company.getName());
    }
}
