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
 * Clase que implementa la interfaz IntContainer y la clase Serializable
 */
public class ProductContainer implements IntContainer, Serializable {

    /**
     * Declaración de variables
     */
    public ArrayList<Product> products = new ArrayList<>();

    /**
     * Constructor del contenedor de productos
     *
     * @throws Exception
     */
    public ProductContainer() throws Exception {
        this.products = new DataBase().readProducts();
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
