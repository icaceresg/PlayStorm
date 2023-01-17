package Class;

public class Client extends User {

    private String lastName, site, creditCard, phone;
    private float wallet;
    private Product[] ownProducts;

    public Client(String lastName, String site, String creditCard, String phone, String name, String email, String password) {
        super(name, email, password);
        this.lastName = lastName;
        this.site = site;
        this.creditCard = creditCard;
        this.phone = phone;
        this.wallet = 0;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getWallet() {
        return wallet;
    }

    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    public Product[] getOwnProducts() {
        return ownProducts;
    }

    public void setOwnProducts(Product[] ownProducts) {
        this.ownProducts = ownProducts;
    }

}
