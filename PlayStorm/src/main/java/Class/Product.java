package Class;

import Class.Iterator.ProductIterator;
import Interfaces.IntCompany;
import java.io.Serializable;

public class Product implements Serializable {

    private String title, description, category;
    private float price;
    private int id;
    private IntCompany company;

    public Product(String title, String description, float price, String category, IntCompany company) throws Exception {
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.company = company;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public IntCompany getCompany() {
        return company;
    }

    public void setCompany(IntCompany company) {
        this.company = company;
    }

}
