package Class;

import Interfaces.IntClient;

/**
 *
 * @author jorge
 */
public class Client extends User implements IntClient {

    private String lastName, location, creditCard, telephone, birthday;
    private float wallet;
    private Product[] ownProducts;

    /**
     *
     * @param name
     * @param email
     * @param password
     * @param lastName
     * @param location
     * @param creditCard
     * @param telephone
     * @param birthday
     */
    public Client(String name, String email, String password, String lastName, String location, String creditCard, String telephone, String birthday) {
        super(name, email, password);
        this.lastName = lastName;
        this.location = location;
        this.creditCard = creditCard;
        this.telephone = telephone;
        this.wallet = 0;
        this.birthday = birthday;
    }

    /**
     *
     * @return
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     */
    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     */
    @Override
    public String getCreditCard() {
        return creditCard;
    }

    /**
     *
     * @param creditCard
     */
    @Override
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     *
     * @return
     */
    @Override
    public String getTelephone() {
        return telephone;
    }

    /**
     *
     * @param telephone
     */
    @Override
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     *
     * @return
     */
    @Override
    public float getWallet() {
        return wallet;
    }

    /**
     *
     * @param wallet
     */
    @Override
    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    /**
     *
     * @return
     */
    @Override
    public Product[] getOwnProducts() {
        return ownProducts;
    }

    /**
     *
     * @param ownProducts
     */
    @Override
    public void setOwnProducts(Product[] ownProducts) {
        this.ownProducts = ownProducts;
    }

    /**
     *
     * @param password
     */
    @Override
    public void setPassword(String password) {
        super.setPassword(password); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public String getPassword() {
        return super.getPassword(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     *
     * @param email
     */
    @Override
    public void setEmail(String email) {
        super.setEmail(email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public String getEmail() {
        return super.getEmail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        super.setName(name); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return super.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public String getBirthday() {
        return birthday;
    }

    /**
     *
     * @param birthday
     */
    @Override
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

}
