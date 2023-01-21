package Class;

import Class.Iterator.ClientIterator;
import Interfaces.IntClient;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client extends User implements IntClient {

    private String lastName, site, creditCard, phone;
    private float wallet;
    private Product[] ownProducts;

    public Client(String name, String email, String password, String lastName, String site, String creditCard, String phone) {
        super(name, email, password);
        this.lastName = lastName;
        this.site = site;
        this.creditCard = creditCard;
        this.phone = phone;
        this.wallet = 0;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public String getCreditCard() {
        return creditCard;
    }

    @Override
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
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
    public Product[] getOwnProducts() {
        return ownProducts;
    }

    @Override
    public void setOwnProducts(Product[] ownProducts) {
        this.ownProducts = ownProducts;
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getPassword() {
        return super.getPassword(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getEmail() {
        return super.getEmail(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setName(String name) {
        super.setName(name); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getName() {
        return super.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
