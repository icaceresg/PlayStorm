package Class.Strategy;

import Interfaces.SearchStrategy;
import Class.Product;
import java.util.List;

/**
 * Clase que se encarga del patrón Strategy
 */
public class Finder {

    /**
     * Declaracion de variables
     */
    private SearchStrategy strategy;

    /**
     * Guarda la estrategia tomada
     *
     * @param strategy
     */
    public void setSearchStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Busca dependiendo de la estrategia
     *
     * @param products, lista de productos
     * @param criteria, criterio utilizado
     * @return products, lista de productos con esa estrategia
     */
    public List<Product> search(List<Product> products, String criteria) {
        return strategy.search(products, criteria);
    }
}
