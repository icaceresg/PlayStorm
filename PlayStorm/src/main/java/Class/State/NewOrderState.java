package Class.State;

import java.io.Serializable;

/**
 *
 * @author jorge
 */
public class NewOrderState implements OrderState, Serializable {

    /**
     *
     * @param status
     * @return
     */
    @Override
    public String processOrder(String status) {
        return "En Proceso";
    }

    /**
     *
     * @param status
     * @return
     */
    @Override
    public String endOrder(String status) {
        return "Finalizado";         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
