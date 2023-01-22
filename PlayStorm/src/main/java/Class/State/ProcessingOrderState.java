package Class.State;

import java.io.Serializable;

public class ProcessingOrderState implements OrderState, Serializable {

    @Override
    public String processOrder(String status) {
        return "Procesado";
    }

    @Override
    public String endOrder(String status) {
        return "Finalizado";
    }

}
