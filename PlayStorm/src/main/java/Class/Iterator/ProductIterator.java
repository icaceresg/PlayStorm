package Class.Iterator;

import Class.Product;
import Interfaces.IntIterator;

/**
 *
 * @author jorge
 */
public class ProductIterator implements IntIterator {

    private int i;
    private ProductContainer productContainer;

    /**
     *
     * @throws Exception
     */
    public ProductIterator() throws Exception {
        this.productContainer = new ProductContainer();
    }

    /**
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        if (i < productContainer.products.size()) {
            return true;
        }
        i = 0;
        return false;

    }

    /**
     *
     * @return
     */
    @Override
    public Product next() {
        if (this.hasNext()) {
            return productContainer.products.get(i++);
        }
        return null;
    }

    /**
     *
     * @param product
     */
    public void addProducts(Product product) {
        productContainer.products.add(product);
    }

    /**
     *
     * @param product
     */
    public void deleteProduct(Product product) {
        productContainer.products.remove(product);
    }

    /**
     *
     * @return
     */
    @Override
    public Product firstItem() {
        return productContainer.products.get(0);
    }

    /**
     *
     * @return
     */
    @Override
    public Product lastItem() {
        return productContainer.products.get(productContainer.products.size() - 1);
    }
}
