/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Iterator;

import Class.DataBase;
import Class.Product;
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
public class ProductContainer implements IntContainer, Serializable{
    public ArrayList<Product> products = new ArrayList<>();
    
    
    public ProductContainer() throws Exception
    {
        //clients.add(new Client("a","a","a","a","a","a","a"));
        //clients.add(new Client("b","b","b","b","b","b","b"));
        
        this.products = new DataBase().readProducts();
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
