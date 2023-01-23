package Interfaces;

import Class.Product;

/**
 *
 * Interfaz de un cliente que extiende de la interfaz User
 */
public interface IntClient extends IntUser {

    /**
     * Indica que el método de IntUser será implementado por la clase
     * que implemente IntClient
     * @return name
     */
    @Override
    public String getName();

    /**
     * Indica que el método de IntUser será implementado por la clase
     * que implemente IntClient
     * @param name
     */
    @Override
    public void setName(String name);

    /**
     * Indica que el método de IntUser será implementado por la clase
     * que implemente IntClient
     * @return email
     */
    @Override
    public String getEmail();

    /**
     * Indica que el método de IntUser será implementado por la clase
     * que implemente IntClient
     * @param email
     */
    @Override
    public void setEmail(String email);

    /**
     * Indica que el método de IntUser será implementado por la clase
     * que implemente IntClient
     * @return password
     */
    @Override
    public String getPassword();

    /**
     * Indica que el método de IntUser será implementado por la clase
     * que implemente IntClient
     * @param password
     */
    @Override
    public void setPassword(String password);

    /**
     * Metodo a implementar
     * @return lastName
     */
    public String getLastName();

    /**
     * Metodo a implementar
     * @param lastName
     */
    public void setLastName(String lastName);

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
     * @return creditCard
     */
    public String getCreditCard();

    /**
     * Metodo a implementar
     * @param creditCard
     */
    public void setCreditCard(String creditCard);

    /**
     * Metodo a implementar
     * @return telephone
     */
    public String getTelephone();

    /**
     * Metodo a implementar
     * @param telephone
     */
    public void setTelephone(String telephone);

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
     * @return ownProducts
     */
    public Product[] getOwnProducts();

    /**
     * Metodo a implementar
     * @param ownProducts
     */
    public void setOwnProducts(Product[] ownProducts);

    /**
     * Metodo a implementar
     * @return bithday
     */
    public String getBirthday();

    /**
     * Metodo a implementar
     * @param birthday
     */
    public void setBirthday(String birthday);
}
