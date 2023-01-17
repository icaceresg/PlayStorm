package Class;

public class Client extends User{
    private String lastName, site, creditCard, phone;
    private float wallet;
    private Product[] ownProducts;

    public Client(String lastName, String site, String creditCard, String phone, float wallet, Product[] ownProducts, String name, String email, String password) {
        super(name, email, password);
        this.lastName = lastName;
        this.site = site;
        this.creditCard = creditCard;
        this.phone = phone;
        this.wallet = wallet;
        this.ownProducts = ownProducts;
    }
}
