package Interfaces;

/**
 *
 * Interfaz del iterador para el patrón Iterador
 */
public interface IntIterator {

    /**
     * Método a implementar
     * @return boolean
     */
    public boolean hasNext();

    /**
     * Método a implementar
     * @return Object
     */
    public Object next();

    /**
     * Método a implementar
     * @return Object
     */
    public Object firstItem();

    /**
     * Método a implementar
     * @return Object
     */
    public Object lastItem();
}
