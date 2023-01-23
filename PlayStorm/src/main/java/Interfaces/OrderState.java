package Interfaces;

/**
 *
 * Interfaz del estado de los pedidos para el patrón State
 */
public interface OrderState {

    /**
     * Método a implementar
     * @param status
     * @return state
     */
    public String processOrder(String status);

    /**
     * Método a implementar
     * @param status
     * @return state
     */
    public String endOrder(String status);
}
