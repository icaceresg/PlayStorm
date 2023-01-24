/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Iterator;

import Class.DataBase;
import Class.Order;
import Interfaces.IntContainer;
import Interfaces.IntIterator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa la interfaz IntContainer y la clase Serializable
 */
public class OrderContainer implements IntContainer, Serializable {

    /**
     * Declaración de variables
     */
    public ArrayList<Order> orders = new ArrayList<>();

    /**
     * Constructor del contenedor de pedidos
     *
     * @throws Exception
     */
    public OrderContainer() throws Exception {
        this.orders = new DataBase().readOrder();
    }

    /**
     * Creación del iterador
     *
     * @return iterator, el iterador
     */
    @Override
    public IntIterator createIterator() {
        try {
            return new ProductIterator();
        } catch (Exception ex) {
            Logger.getLogger(ProductContainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
