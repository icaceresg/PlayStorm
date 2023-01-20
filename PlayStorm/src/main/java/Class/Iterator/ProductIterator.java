/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Iterator;

import Class.Client;
import Class.Product;
import Interfaces.IntIterator;

/**
 *
 * @author jorge
 */
public class ProductIterator implements IntIterator{
    private int i;
    private ProductContainer productContainer;

    public ProductIterator() throws Exception {
        this.productContainer = new ProductContainer();
    }

    @Override
    public boolean hasNext() {
        if(i < productContainer.products.size())
            return true;
        return false;
    }

    @Override
    public Product next() {
        if(this.hasNext())
            return productContainer.products.get(i++);
        return null;
    }
    
    public void addProducts(Product product)
    {
        productContainer.products.add(product);
    }
    
    @Override
    public Product firstItem()
    {
        return productContainer.products.get(0);
    }
    
    @Override
    public Product lastItem()
    {
        return productContainer.products.get(productContainer.products.size()-1);
    }
}
