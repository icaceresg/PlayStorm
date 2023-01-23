package Interfaces;

/**
 *
 * Interfaz container para el patrón Iterator
 */
public interface IntContainer {

    /**
     * Método a implementar
     * @return IntIterator
     */
    public IntIterator createIterator();
}
