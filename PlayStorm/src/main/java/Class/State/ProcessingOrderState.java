package Class.State;

public class ProcessingOrderState implements OrderState {

    @Override
    public String processOrder(String status) {
        return "Procesado";
    }

    @Override
    public String endOrder(String status) {
        return "Finalizado";
    }

}
