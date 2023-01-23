package Class;

import Interfaces.IntCompany;
import java.util.Map;

/**
 *
 * @author jorge
 */
public class Company extends User implements IntCompany {

    private String location, cif;
    private Product[] products;
    private float wallet;
    private Map<String, Integer> discounts; //String to promotional code, int to % discount
    private Company[] company; //List to companys

    /**
     *
     * @param name
     * @param email
     * @param password
     * @param location
     * @param cif
     */
    public Company(String name, String email, String password, String location, String cif) {
        super(name, email, password);
        this.location = location;
        this.cif = cif;
        this.wallet = 0;
    }

    /**
     *
     * @return
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     */
    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     */
    @Override
    public String getCif() {
        return cif;
    }

    /**
     *
     * @param cif
     */
    @Override
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     *
     * @return
     */
    @Override
    public Product[] getProducts() {
        return products;
    }

    /**
     *
     * @param products
     */
    @Override
    public void setProducts(Product[] products) {
        this.products = products;
    }

    /**
     *
     * @return
     */
    @Override
    public float getWallet() {
        return wallet;
    }

    /**
     *
     * @param wallet
     */
    @Override
    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    /**
     *
     * @return
     */
    @Override
    public Map<String, Integer> getDiscounts() {
        return discounts;
    }

    /**
     *
     * @param discounts
     */
    @Override
    public void setDiscounts(Map<String, Integer> discounts) {
        this.discounts = discounts;
    }

    /**
     *
     * @return
     */
    @Override
    public Company[] getCompany() {
        return company;
    }

    /**
     *
     * @param company
     */
    @Override
    public void setCompany(Company[] company) {
        this.company = company;
    }
}
