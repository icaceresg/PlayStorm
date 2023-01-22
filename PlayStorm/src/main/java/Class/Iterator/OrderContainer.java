/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Iterator;

import Class.DataBase;
import Class.State.Order;
import Interfaces.IntContainer;
import Interfaces.IntIterator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class OrderContainer implements IntContainer, Serializable {

    public ArrayList<Order> orders = new ArrayList<>();

    public OrderContainer() throws Exception {
        this.orders = new DataBase().readOrder();
    }

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
