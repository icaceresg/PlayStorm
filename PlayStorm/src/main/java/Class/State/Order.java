/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.State;

import Class.Product;
import Interfaces.IntClient;
import Interfaces.IntCompany;

/**
 *
 * @author jorge
 */
public class Order {

    private int id;
    private IntClient client;
    private Product[] product;
    private IntCompany company;
    private String status;

    private OrderState currentState;

    public Order(int id, IntClient client, Product[] product, IntCompany company, String status) {
        this.id = id;
        this.client = client;
        this.product = product;
        this.company = company;
        this.status = status;

        currentState = new NewOrderState();
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

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
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
