/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Class.State;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Order order = new Order(1, null, null, null, "");
        order.process(); // prints "Order is being processed"
        System.out.println(order.getStatus());
        order.setState(new ProcessingOrderState());
        System.out.println(order.getStatus());
        order.finish(); // prints "Order processing cannot be canceled"
        System.out.println(order.getStatus());

    }
}
