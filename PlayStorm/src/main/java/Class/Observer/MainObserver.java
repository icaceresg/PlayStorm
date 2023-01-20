/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Class.Observer;

/**
 *
 * @author AdriiM_
 */
public class MainObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Money money= new Money();
        AdministratorObserver observer=new AdministratorObserver(money);
        
        System.out.println("Modificacion cuenta bancaria");
        money.setMoney(200);
         System.out.println("Dinero:" + money.getMoney());
         observer.Update();
        
        
    }
    
}
