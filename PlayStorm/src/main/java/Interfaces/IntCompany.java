package Interfaces;

import Class.Product;
import Class.Company;
import java.util.Map;

public interface IntCompany extends IntUser {

    public String getLocation();

    public void setLocation(String location);

    public String getCif();

    public void setCif(String cif);

    public Product[] getProducts();

    public void setProducts(Product[] products);

    public float getWallet();

    public void setWallet(float wallet);

    public Map<String, Integer> getDiscounts();

    public void setDiscounts(Map<String, Integer> discounts);

    public Company[] getCompany();

    public void setCompany(Company[] company);
}
