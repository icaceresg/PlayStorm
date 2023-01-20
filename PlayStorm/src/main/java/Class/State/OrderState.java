/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Class.State;

/**
 *
 * @author jorge
 */
public interface OrderState {

    //En proceso y finalizado
    public String processOrder(String status);

    public String endOrder(String status);
}
