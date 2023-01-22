package Class.State;

import java.io.Serializable;

public class NewOrderState implements OrderState, Serializable {

    @Override
    public String processOrder(String status) {
        return "En Proceso";
    }

    @Override
    public String endOrder(String status) {
        return "Finalizado";         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
