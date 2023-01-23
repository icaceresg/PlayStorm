package Interfaces;

import Class.Product;

/**
 *
 * @author jorge
 */
public interface IntClient extends IntUser {

    /**
     *
     * @return
     */
    @Override
    public String getName();

    /**
     *
     * @param name
     */
    @Override
    public void setName(String name);

    /**
     *
     * @return
     */
    @Override
    public String getEmail();

    /**
     *
     * @param email
     */
    @Override
    public void setEmail(String email);

    /**
     *
     * @return
     */
    @Override
    public String getPassword();

    /**
     *
     * @param password
     */
    @Override
    public void setPassword(String password);

    /**
     *
     * @return
     */
    public String getLastName();

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName);

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
    public String getCreditCard();

    /**
     *
     * @param creditCard
     */
    public void setCreditCard(String creditCard);

    /**
     *
     * @return
     */
    public String getTelephone();

    /**
     *
     * @param telephone
     */
    public void setTelephone(String telephone);

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
    public Product[] getOwnProducts();

    /**
     *
     * @param ownProducts
     */
    public void setOwnProducts(Product[] ownProducts);

    /**
     *
     * @return
     */
    public String getBirthday();

    /**
     *
     * @param birthday
     */
    public void setBirthday(String birthday);
}
