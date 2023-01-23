package Class.State;

import Interfaces.OrderState;
import java.io.Serializable;

/**
 *
 * @author jorge
 */
public class ProcessingOrderState implements OrderState, Serializable {

    /**
     *
     * @param status
     * @return
     */
    @Override
    public String processOrder(String status) {
        return "Procesado";
    }

    /**
     *
     * @param status
     * @return
     */
    @Override
    public String endOrder(String status) {
        return "Finalizado";
    }

}
