package Class;

import Class.Iterator.ProductIterator;
import Interfaces.IntCompany;
import java.io.Serializable;

/**
 * Clase que implementa la Serializable para guardar datos.
 */
public class Product implements Serializable {

    /**
     * Declaración de variables
     */
    private String title, description, category;
    private float price;
    private int id;
    private IntCompany company;

    /**
     * Constructor del producto
     *
     * @param title, título del producto
     * @param description, descripción del producto
     * @param price, precio del producto
     * @param category, categoría del producto
     * @param company, empresa asociada al producto
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
     * Devuelve el ID del producto
     *
     * @return id, ID del producto
     */
    public int getId() {
        return id;
    }

    /**
     * Guarda el ID del producto
     *
     * @param id, ID del producto
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el título del producto
     *
     * @return title, título del producto
     */
    public String getTitle() {
        return title;
    }

    /**
     * Guarda el título del producto
     *
     * @param title, título del producto
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Devuelve la descripción del producto
     *
     * @return description, descripción del producto
     */
    public String getDescription() {
        return description;
    }

    /**
     * Guarda la descripción del producto
     *
     * @param description, descripción del producto
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Devuelve el precio del producto
     *
     * @return price, precio del producto
     */
    public float getPrice() {
        return price;
    }

    /**
     * Guarda el precio del producto
     *
     * @param price, precio del producto
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Devuelve la categoría del producto
     *
     * @return category, categoría del producto
     */
    public String getCategory() {
        return category;
    }

    /**
     * Guarda la categoría del producto
     *
     * @param category, categoría del producto
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Devuelve la empresa del producto
     *
     * @return company, empresa del producto
     */
    public IntCompany getCompany() {
        return company;
    }

    /**
     * Guarda la empresa del producto
     *
     * @param company, empresa del producto
     */
    public void setCompany(IntCompany company) {
        this.company = company;
    }

}
