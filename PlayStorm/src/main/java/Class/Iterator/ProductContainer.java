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
public class ProductContainer implements IntContainer, Serializable {

    /**
     *
     */
    public ArrayList<Product> products = new ArrayList<>();

    /**
     *
     * @throws Exception
     */
    public ProductContainer() throws Exception {
        this.products = new DataBase().readProducts();
    }

    /**
     *
     * @return
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
