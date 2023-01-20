/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.State;

/**
 *
 * @author jorge
 */
public class NewOrderState implements OrderState {

    @Override
    public String processOrder(String status) {
        return "En Proceso";
    }

    @Override
    public String endOrder(String status) {
        return "Finalizado";         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
