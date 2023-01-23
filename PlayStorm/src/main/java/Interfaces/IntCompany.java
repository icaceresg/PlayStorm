package Interfaces;

import Class.Product;
import Class.Company;
import java.util.Map;

/**
 *
 * @author jorge
 */
public interface IntCompany extends IntUser {

    /**
     *
     * @return
     */
    public String getLocation();

    /**
     *
     * @param location
     */
    public void setLocation(String location);

    /**
     *
     * @return
     */
    public String getCif();

    /**
     *
     * @param cif
     */
    public void setCif(String cif);

    /**
     *
     * @return
     */
    public Product[] getProducts();

    /**
     *
     * @param products
     */
    public void setProducts(Product[] products);

    /**
     *
     * @return
     */
    public float getWallet();

    /**
     *
     * @param wallet
     */
    public void setWallet(float wallet);

    /**
     *
     * @return
     */
    public Map<String, Integer> getDiscounts();

    /**
     *
     * @param discounts
     */
    public void setDiscounts(Map<String, Integer> discounts);

    /**
     *
     * @return
     */
    public Company[] getCompany();

    /**
     *
     * @param company
     */
    public void setCompany(Company[] company);
}
