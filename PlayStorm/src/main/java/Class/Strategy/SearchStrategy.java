/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Class.Strategy;

import Class.Product;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface SearchStrategy {

    /**
     *
     * @param products
     * @param criteria
     * @return
     */
    public List<Product> search(List<Product> products, String criteria);
}
