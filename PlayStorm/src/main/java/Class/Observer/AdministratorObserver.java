/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Observer;

/**
 *
 * @author AdriiM_
 */
public class AdministratorObserver extends Observer {
    private Money money= new Money();
    public AdministratorObserver(Money money){
    this.money=money;
    }
    
    public void Update() {
        System.out.println("ADMINISTRADOR: Tiene " + money.getMoney() +" euros en la cuenta bancaria ");  
    }
    
}
