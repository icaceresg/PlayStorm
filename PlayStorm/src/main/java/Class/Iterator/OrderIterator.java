/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Iterator;

import Class.DataBase;
import Class.State.Order;
import Interfaces.IntClient;
import Interfaces.IntIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class OrderIterator implements IntIterator {

    private int i;
    private OrderContainer orderContainer;

    public OrderIterator() throws Exception {
        this.orderContainer = new OrderContainer();
    }

    @Override
    public boolean hasNext() {
        if (i < orderContainer.orders.size()) {
            return true;
        }
        i = 0;
        return false;

    }

    @Override
    public Order next() {
        if (this.hasNext()) {
            return orderContainer.orders.get(i++);
        }
        return null;
    }

    public void addOrder(Order order) {
        orderContainer.orders.add(order);
    }

    public void deleteOrder(Order order) {
        orderContainer.orders.remove(order);
    }

    @Override
    public Order firstItem() {
        return orderContainer.orders.get(0);
    }

    @Override
    public Order lastItem() {
        return orderContainer.orders.get(orderContainer.orders.size() - 1);
    }

    public Order getOrder(IntClient clientOrder) {

        try {
            Order order;
            OrderIterator orderIterator = new OrderIterator();
            while (orderIterator.hasNext()) {
                Order orderSearch = orderIterator.next();
                if (orderSearch.getClient().getEmail().equals(clientOrder.getEmail()) & !orderSearch.getStatus().equals("Finalizado")) {
                    return orderSearch;
                }
            }
            order = new Order(clientOrder);
            
            DataBase dataBase = new DataBase();
            dataBase.saveIteratorOrder(orderIterator);

            return order;
        } catch (Exception ex) {
            Logger.getLogger(OrderIterator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
