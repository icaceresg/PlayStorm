package Class;

import Class.Iterator.ProductIterator;
import Interfaces.IntCompany;
import java.io.Serializable;

/**
 *
 * @author jorge
 */
public class Product implements Serializable {

    private String title, description, category;
    private float price;
    private int id;
    private IntCompany company;

    /**
     *
     * @param title
     * @param description
     * @param price
     * @param category
     * @param company
     * @throws Exception
     */
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

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public float getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @return
     */
    public IntCompany getCompany() {
        return company;
    }

    /**
     *
     * @param company
     */
    public void setCompany(IntCompany company) {
        this.company = company;
    }

}
