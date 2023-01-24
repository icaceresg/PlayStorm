package Interfaces;

/**
 *
 * Interfaz usada para el patrón Observer
 */
public interface Subject {

    /**
     * Almacena un observador
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * Elimina un observador
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * Notifica a un observador
     *
     */
    void notifyObservers();
}
