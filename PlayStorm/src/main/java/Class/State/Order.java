package Class.State;

import Class.Iterator.OrderIterator;
import Class.Product;
import Interfaces.IntClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Order implements Serializable {

    private static Order instance;
    private int id;
    private IntClient client;
    private ArrayList<Product> products = new ArrayList<Product>();
    private String status;

    private OrderState currentState;

    public Order(IntClient client) {
        try {
            OrderIterator iterator = new OrderIterator();
            if (!iterator.hasNext()) {
                this.id = 0;
            } else {
                this.id = new OrderIterator().lastItem().getId() + 1;
            }
            this.client = client;
            this.status = "";

            currentState = new NewOrderState();
        } catch (Exception ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addProduct(Product product) {
        this.products.add(product);

    }

    public void deleteProduct(Product product) {
        this.products.remove(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IntClient getClient() {
        return client;
    }

    public void setClient(IntClient client) {
        this.client = client;
    }

    public ArrayList<Product> getProduct() {
        return products;
    }

    public void setProduct(ArrayList<Product> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setState(OrderState newState) {
        currentState = newState;
    }

    public void process() {
        setStatus(currentState.processOrder(status));
    }

    public void finish() {
        setStatus(currentState.endOrder(status));
    }

}
