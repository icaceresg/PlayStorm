package Class;

import Class.Iterator.ProductIterator;
import java.io.Serializable;

public class Product implements Serializable {

    private String title, description, category;
    private float price;
    private int amount;
    private int id;

    public Product(String title, String description, float price, int amount, String category) throws Exception {
        this.title = title;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.category = category;
        ProductIterator iterator = new ProductIterator();
        if (!iterator.hasNext()) {
            this.id = 0;
        } else {
            this.id = new ProductIterator().lastItem().getId() + 1;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
