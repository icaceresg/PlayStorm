/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.State;

import Class.Product;
import Interfaces.IntClient;
import Interfaces.IntCompany;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Order {
    
    private static Order instance;
    private int id;
    private IntClient client;
    private ArrayList<Product> products = new ArrayList<Product>();
    private IntCompany company;
    private String status;

    private OrderState currentState;
            
            
    public static Order getInstance(IntClient client) {
        if (instance == null) {
            instance = new Order(0, client, "");
        }
        return instance;
    }
    
    public static Order getInstance() {
        return instance;
    }
    
    private Order(int id, IntClient client, String status) {
        this.id = id;
        this.client = client;
        this.status = status;

        currentState = new NewOrderState();
    }
    
    
    public void addProduct(Product product)
    {
        this.products.add(product);
    }
    
    public void deleteProduct(Product product)
    {
        return;
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

    public IntCompany getCompany() {
        return company;
    }

    public void setCompany(IntCompany company) {
        this.company = company;
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
