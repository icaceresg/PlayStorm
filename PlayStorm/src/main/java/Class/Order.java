package Class;

import Interfaces.OrderState;
import Class.Iterator.OrderIterator;
import Class.State.NewOrderState;
import Interfaces.IntClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que hace de pedido e implementa Serializable
 */
public class Order implements Serializable {

    /**
     * Declaración de variables
     */
    private static Order instance;
    private int id;
    private IntClient client;
    private ArrayList<Product> products = new ArrayList<Product>();
    private String status;

    private OrderState currentState;

    /**
     * Constructor del pedido
     *
     * @param client, cliente del pedido
     */
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

    /**
     * Añadir un producto al pedido
     *
     * @param product, producto a añadir
     */
    public void addProduct(Product product) {
        this.products.add(product);

    }

    /**
     * Eliminar un producto
     *
     * @param product, producto a eliminar
     */
    public void deleteProduct(Product product) {
        this.products.remove(product);
    }

    /**
     * Devuelve el ID del pedido
     *
     * @return id, id del pedido
     */
    public int getId() {
        return id;
    }

    /**
     * Guardar el ID del pedido
     *
     * @param id, id del pedido
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el cliente del pedido
     *
     * @return client, cliente del pedido
     */
    public IntClient getClient() {
        return client;
    }

    /**
     * Guarda el cliente del pedido
     *
     * @param client, cliente del pedido
     */
    public void setClient(IntClient client) {
        this.client = client;
    }

    /**
     * Devuelve la lista de productos
     *
     * @return products, lista de productos
     */
    public ArrayList<Product> getProduct() {
        return products;
    }

    /**
     * Guarda la lista de productos
     *
     * @param products, lista de productos
     */
    public void setProduct(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * Devuelve el estado del pedido
     *
     * @return status, estado del pedido
     */
    public String getStatus() {
        return status;
    }

    /**
     * Guarda el estado del pedido
     *
     * @param status, estado del pedido
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Guarda el estado del pedido
     *
     * @param newState, estado del pedido
     */
    public void setState(OrderState newState) {
        currentState = newState;
    }

    /**
     * Hace que el pedido esté en proceso
     */
    public void process() {
        setStatus(currentState.processOrder(status));
    }

    /**
     * Hace que el pedido esté finalizado
     */
    public void finish() {
        setStatus(currentState.endOrder(status));
    }

}
