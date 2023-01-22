package Class.State;

public interface OrderState {

    public String processOrder(String status);

    public String endOrder(String status);
}
