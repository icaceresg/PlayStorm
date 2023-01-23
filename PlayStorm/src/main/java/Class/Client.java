package Class;

import Interfaces.IntClient;

/**
 * Clase que extiende del Usuario e implementa la interfaz IntClient.
 */
public class Client extends User implements IntClient {

    /**
     * Declaración de variables
     */
    private String lastName, location, creditCard, telephone, birthday;
    private float wallet;
    private Product[] ownProducts;

    /**
     * Contructor del cliente
     *
     * @param name, nombre del cliente
     * @param email, correo del cliente
     * @param password, contraseña del cliente
     * @param lastName, apellido del cliente
     * @param location, localización del cliente
     * @param creditCard, tarjeta de crédito del cliente
     * @param telephone, teléfono del cliente
     * @param birthday, cumpleaños del cliente
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
     * Devuelve su apellido
     *
     * @return lastName, apellido del cliente
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * Guarda el apellido del cliente
     *
     * @param lastName, nuevo apellido del cliente
     */
    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Devuelve su localización
     *
     * @return location, localización del cliente
     */
    @Override
    public String getLocation() {
        return location;
    }

    /**
     * Guarda la localización del cliente
     *
     * @param location, nueva localización del cliente
     */
    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Devuelve su tarjeta de crédito
     *
     * @return creditCard, tarjeta de crédito del cliente
     */
    @Override
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * Guarda la tarjeta de crédito del cliente
     *
     * @param creditCard, nueva tarjeta de crédito del cliente
     */
    @Override
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * Devuelve su teléfono
     *
     * @return telephone, teléfono del cliente
     */
    @Override
    public String getTelephone() {
        return telephone;
    }

    /**
     * Guarda el teléfono del cliente
     *
     * @param telephone, nuevo teléfono del cliente
     */
    @Override
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Devuelve su cartera
     *
     * @return wallet, cartera del cliente
     */
    @Override
    public float getWallet() {
        return wallet;
    }

    /**
     * Guarda la cartera del cliente
     *
     * @param wallet, nueva cartera del cliente
     */
    @Override
    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    /**
     * Devuelve la lista de productos del cliente
     *
     * @return ownProducts, lista de productos del cliente
     */
    @Override
    public Product[] getOwnProducts() {
        return ownProducts;
    }

    /**
     * Guarda la lista de productos del cliente
     *
     * @param ownProducts, nueva lista de productos del cliente
     */
    @Override
    public void setOwnProducts(Product[] ownProducts) {
        this.ownProducts = ownProducts;
    }

    /**
     * Guarda la contraseña del cliente
     *
     * @param password, nueva contraseña del cliente
     */
    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    /**
     * Devuelve su contraseña
     *
     * @return password, contraseña del cliente
     */
    @Override
    public String getPassword() {
        return super.getPassword();
    }

    /**
     * Guarda el correo del cliente
     *
     * @param email, nuevo correo del cliente
     */
    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    /**
     * Devuelve su correo
     *
     * @return email, correo del cliente
     */
    @Override
    public String getEmail() {
        return super.getEmail();
    }

    /**
     * Guarda el nombre del cliente
     *
     * @param name, nuevo nombre del cliente
     */
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    /**
     * Devuelve su nombre
     *
     * @return name, nombre del cliente
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Devuelve su cumpleaños
     *
     * @return birthday, cumpleaños del cliente
     */
    @Override
    public String getBirthday() {
        return birthday;
    }

    /**
     * Guarda el cumpleaños del cliente
     *
     * @param birthday, nuevo cumpleaños del cliente
     */
    @Override
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

}
