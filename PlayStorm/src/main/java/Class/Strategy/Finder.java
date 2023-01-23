/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Strategy;

import Interfaces.SearchStrategy;
import Class.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Finder {

    private SearchStrategy strategy;

    /**
     *
     * @param strategy
     */
    public void setSearchStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     *
     * @param products
     * @param criteria
     * @return
     */
    public List<Product> search(List<Product> products, String criteria) {
        return strategy.search(products, criteria);
    }
}
