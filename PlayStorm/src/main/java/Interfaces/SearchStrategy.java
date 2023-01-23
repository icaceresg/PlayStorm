
package Interfaces;

import Class.Product;
import java.util.List;

/**
 * 
 * Interfaz para la creación de estrategia de búsqueda para el patrón Strategy
 */
public interface SearchStrategy {

    /**
     * Método a implementar
     * @param products
     * @param criteria
     * @return 
     */
    public List<Product> search(List<Product> products, String criteria);
}
