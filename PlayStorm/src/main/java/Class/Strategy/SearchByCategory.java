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
public class SearchByCategory implements SearchStrategy {

    /**
     *
     * @param products
     * @param criteria
     * @return
     */
    @Override
    public List<Product> search(List<Product> products, String criteria) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(criteria)) {
                result.add(product);
            }
        }
        return result;
    }
}
