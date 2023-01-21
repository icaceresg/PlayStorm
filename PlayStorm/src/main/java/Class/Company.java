/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Interfaces.IntCompany;
import java.util.Map;

/**
 *
 * @author jorge
 */
public class Company extends User implements IntCompany {

    private String site, cif;
    private Product[] products;
    private float wallet;
    private Map<String, Integer> discounts; //String to promotional code, int to % discount
    private Company[] company; //List to companys

    public Company(String name, String email, String password, String site, String cif) {
        super(name, email, password);
        this.site = site;
        this.cif = cif;
        this.wallet = 0;
    }

    @Override
    public String getSite() {
        return site;
    }

    @Override
    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String getCif() {
        return cif;
    }

    @Override
    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public Product[] getProducts() {
        return products;
    }

    @Override
    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public float getWallet() {
        return wallet;
    }

    @Override
    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    @Override
    public Map<String, Integer> getDiscounts() {
        return discounts;
    }

    @Override
    public void setDiscounts(Map<String, Integer> discounts) {
        this.discounts = discounts;
    }

    @Override
    public Company[] getCompany() {
        return company;
    }

    @Override
    public void setCompany(Company[] company) {
        this.company = company;
    }
}
