package Class.State;

import Interfaces.OrderState;
import java.io.Serializable;

/**
 * Clase que implementa la interfaz OrderState y Serializable
 */
public class ProcessingOrderState implements OrderState, Serializable {

    /**
     * Poner el pedido en proceso
     *
     * @param status, estado del pedido
     * @return String
     */
    @Override
    public String processOrder(String status) {
        return "En Proceso";
    }

    /**
     * Finalizar pedido
     *
     * @param status, estado del pedido
     * @return String
     */
    @Override
    public String endOrder(String status) {
        return "Finalizado";
    }

}
