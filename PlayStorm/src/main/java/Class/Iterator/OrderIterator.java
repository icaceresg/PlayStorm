/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Iterator;

import Class.DataBase;
import Class.Order;
import Interfaces.IntClient;
import Interfaces.IntIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa la interfaz IntIterator y se encarga de seleccionar un
 * pedido del contenedor
 */
public class OrderIterator implements IntIterator {

    /**
     * Declaración de variables
     */
    private int i;
    private OrderContainer orderContainer;

    /**
     * Creación del iterador
     *
     * @throws Exception
     */
    public OrderIterator() throws Exception {
        this.orderContainer = new OrderContainer();
    }

    /**
     * Devuelve si hay un pedido más en el contenedor
     *
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        if (i < orderContainer.orders.size()) {
            return true;
        }
        i = 0;
        return false;

    }

    /**
     * Devuelve el pedido siguiente
     *
     * @return order, siguiente pedido
     */
    @Override
    public Order next() {
        if (this.hasNext()) {
            return orderContainer.orders.get(i++);
        }
        return null;
    }

    /**
     * Añade un pedido al contenedor
     *
     * @param order, pedido nuevo
     */
    public void addOrder(Order order) {
        orderContainer.orders.add(order);
    }

    /**
     * Elimina un pedido
     *
     * @param order, pedido que eliminar
     */
    public void deleteOrder(Order order) {
        orderContainer.orders.remove(order);
    }

    /**
     * Devuelve el primer pedido
     *
     * @return order, primer pedido
     */
    @Override
    public Order firstItem() {
        return orderContainer.orders.get(0);
    }

    /**
     * Devuelve el último pedido
     *
     * @return order, último pedido
     */
    @Override
    public Order lastItem() {
        return orderContainer.orders.get(orderContainer.orders.size() - 1);
    }

    /**
     * Devuelve el pedido a través del cliente
     *
     * @param clientOrder, cliente del pedido
     * @return order, pedido buscado;
     */
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
