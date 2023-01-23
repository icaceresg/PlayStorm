package Class;

import Interfaces.IntCompany;
import java.util.Map;

/**
 * Clase que extiende del Usuario e implementa la interfaz IntCompany.
 */
public class Company extends User implements IntCompany {

    /**
     * Declaración de variables
     */
    private String location, cif;
    private Product[] products;
    private float wallet;
    private Map<String, Integer> discounts; //String to promotional code, int to % discount
    private Company[] company; //List to companys

    /**
     * Constructor de la empresa
     *
     * @param name, nombre de la empresa
     * @param email, email de la empresa
     * @param password, contraseña de la empresa
     * @param location, localización de la empresa
     * @param cif, cif de la empresa
     */
    public Company(String name, String email, String password, String location, String cif) {
        super(name, email, password);
        this.location = location;
        this.cif = cif;
        this.wallet = 0;
    }

    /**
     * Devuelve la localización de la empresa
     *
     * @return location, localización de la empresa
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     * Guarda la localización de la empresa
     *
     * @param location, localización de la empresa
     */
    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Devuelve el CIF de la empresa
     *
     * @return cif, CIF de la empresa
     */
    @Override
    public String getCif() {
        return cif;
    }

    /**
     * Guarda el CIF de la empresa
     *
     * @param cif, CIF de la empresa
     */
    @Override
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * Devuelve la lista de productos de la empresa
     *
     * @return products, lista de productos de la empresa
     */
    @Override
    public Product[] getProducts() {
        return products;
    }

    /**
     * Guarda la lista de productos de la empresa
     *
     * @param products, lista de productos de la empresa
     */
    @Override
    public void setProducts(Product[] products) {
        this.products = products;
    }

    /**
     * Devuelve el monedero de la empresa
     *
     * @return wallet, monedero de la empresa
     */
    @Override
    public float getWallet() {
        return wallet;
    }

    /**
     * Guarda el monedero de la empresa
     *
     * @param wallet, monedero de la empresa
     */
    @Override
    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    /**
     * Devuelve los descuentos de la empresa
     *
     * @return discounts, descuentos de la empresa
     */
    @Override
    public Map<String, Integer> getDiscounts() {
        return discounts;
    }

    /**
     * Guarda los descuentos de la empresa
     *
     * @param discounts, descuentos de la empresa
     */
    @Override
    public void setDiscounts(Map<String, Integer> discounts) {
        this.discounts = discounts;
    }

    /**
     * Devuelve las empresas de la empresa
     *
     * @return company, empresas de la empresa
     */
    @Override
    public Company[] getCompany() {
        return company;
    }

    /**
     * Guarda las empresas de la empresa
     *
     * @param company, empresas de la empresa
     */
    @Override
    public void setCompany(Company[] company) {
        this.company = company;
    }
}
