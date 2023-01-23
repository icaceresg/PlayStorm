package Interfaces;

import Class.Product;
import Class.Company;
import java.util.Map;

/**
 * Interfaz de empresas para realizar el patrón Abstract Factory
 * 
 */
public interface IntCompany extends IntUser {

    /**
     * Metodo a implementar
     * @return location
     */
    public String getLocation();

    /**
     * Metodo a implementar
     * @param location
     */
    public void setLocation(String location);

    /**
     * Metodo a implementar
     * @return cif
     */
    public String getCif();

    /**
     * Metodo a implementar
     * @param cif
     */
    public void setCif(String cif);

    /**
     * Metodo a implementar
     * @return products
     */
    public Product[] getProducts();

    /**
     * Metodo a implementar
     * @param products
     */
    public void setProducts(Product[] products);

    /**
     * Metodo a implementar
     * @return wallet
     */
    public float getWallet();

    /**
     * Metodo a implementar
     * @param wallet
     */
    public void setWallet(float wallet);

    /**
     * Metodo a implementar
     * Este método será implementado en un futuro
     * @return discounts
     */
    public Map<String, Integer> getDiscounts();

    /**
     * Metodo a implementar
     * Este método será implementado en un futuro
     * @param discounts
     */
    public void setDiscounts(Map<String, Integer> discounts);

    /**
     * Método a implementar
     * @return company
     */
    public Company[] getCompany();

    /**
     * Método a implementar
     * @param company
     */
    public void setCompany(Company[] company);
}
