package Class;

import java.util.Map;


public class Company extends User{
    String site, cif;
    Product [] products;
    float wallet;
    boolean subscribe;
    Map <String, Integer> discounts; //String to promotional code, int to % discount
    Company [] company; //List to companys

    public Company(String name, String email, String password, String site, String cif, boolean subscribe) {
        super(name, email, password);
        this.site = site;
        this.cif = cif;
        this.wallet = 0;
        this.subscribe = subscribe;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public float getWallet() {
        return wallet;
    }

    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }

    public Map<String, Integer> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Map<String, Integer> discounts) {
        this.discounts = discounts;
    }

    public Company[] getCompany() {
        return company;
    }

    public void setCompany(Company[] company) {
        this.company = company;
    }
    
    
}
