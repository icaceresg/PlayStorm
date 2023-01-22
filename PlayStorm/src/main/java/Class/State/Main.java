package Class.State;

public class Main {

    public static void main(String[] args) {
        Order order = Order.getInstance(null);
        order.process(); // prints "Order is being processed"
        System.out.println(order.getStatus());
        order.setState(new ProcessingOrderState());
        System.out.println(order.getStatus());
        order.finish(); // prints "Order processing cannot be canceled"
        System.out.println(order.getStatus());

    }
}
