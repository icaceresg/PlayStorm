/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Class.Product;

import Class.Company;
import java.util.Map;

/**
 *
 * @author jorge
 */
public interface IntCompany extends IntUser{

    public String getSite();

    public void setSite(String site);

    public String getCif();

    public void setCif(String cif);

    public Product[] getProducts();

    public void setProducts(Product[] products);

    public float getWallet();

    public void setWallet(float wallet);

    public boolean isSubscribe();

    public void setSubscribe(boolean subscribe);

    public Map<String, Integer> getDiscounts();

    public void setDiscounts(Map<String, Integer> discounts);

    public Company[] getCompany();

    public void setCompany(Company[] company);
}
