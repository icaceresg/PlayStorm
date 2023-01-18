/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Class.Product;

/**
 *
 * @author jorge
 */
public interface IntClient extends IntUser {

    @Override
    public String getName();

    @Override
    public void setName(String name);

    @Override
    public String getEmail();

    @Override
    public void setEmail(String email);

    @Override
    public String getPassword();

    @Override
    public void setPassword(String password);

    public String getLastName();

    public void setLastName(String lastName);

    public String getSite();

    public void setSite(String site);

    public String getCreditCard();

    public void setCreditCard(String creditCard);

    public String getPhone();

    public void setPhone(String phone);

    public float getWallet();

    public void setWallet(float wallet);

    public Product[] getOwnProducts();

    public void setOwnProducts(Product[] ownProducts);
}
