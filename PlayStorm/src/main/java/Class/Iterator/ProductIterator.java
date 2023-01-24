package Class.Iterator;

import Class.Product;
import Interfaces.IntIterator;

/**
 * Clase que implementa la interfaz IntIterator y se encarga de seleccionar un
 * producto del contenedor
 */
public class ProductIterator implements IntIterator {

    /**
     * Declaración de variables
     */
    private int i;
    private ProductContainer productContainer;

    /**
     * Creación del iterador
     *
     * @throws Exception
     */
    public ProductIterator() throws Exception {
        this.productContainer = new ProductContainer();
    }

    /**
     * Devuelve si hay un producto más en el contenedor
     *
     * @return boolean
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
     * Devuelve el producto siguiente
     *
     * @return producto, siguiente producto
     */
    @Override
    public Product next() {
        if (this.hasNext()) {
            return productContainer.products.get(i++);
        }
        return null;
    }

    /**
     * Añade un producto al contenedor
     *
     * @param product, producto nuevo
     */
    public void addProducts(Product product) {
        productContainer.products.add(product);
    }

    /**
     * Elimina un producto
     *
     * @param product, producto que eliminar
     */
    public void deleteProduct(Product product) {
        productContainer.products.remove(product);
    }

    /**
     * Devuelve el primer producto
     *
     * @return product, primer producto
     */
    @Override
    public Product firstItem() {
        return productContainer.products.get(0);
    }

    /**
     * Devuelve el último producto
     *
     * @return product, último producto
     */
    @Override
    public Product lastItem() {
        return productContainer.products.get(productContainer.products.size() - 1);
    }
}
