package Interfaces;

import Class.Product;

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

    public String getLocation();

    public void setLocation(String location);

    public String getCreditCard();

    public void setCreditCard(String creditCard);

    public String getTelephone();

    public void setTelephone(String telephone);

    public float getWallet();

    public void setWallet(float wallet);

    public Product[] getOwnProducts();

    public void setOwnProducts(Product[] ownProducts);

    public String getBirthday();

    public void setBirthday(String birthday);
}
