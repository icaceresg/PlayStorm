package Class.Strategy;

import Interfaces.SearchStrategy;
import Class.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la interfaz SearchStrategy
 */
public class SearchByName implements SearchStrategy {

    /**
     * Busca por nombre
     *
     * @param products, lista de productos
     * @param criteria, criterio
     * @return lista de productos filtrado
     */
    @Override
    public List<Product> search(List<Product> products, String criteria) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getTitle().contains(criteria)) {
                result.add(product);
            }
        }
        return result;
    }
}
