package Interfaces;

/**
 *
 * Interfaz del Usuario para su creación en el patrón Abstract Factory
 */
public interface IntUser {

    /**
     * Método a implementar
     * @return name
     */
    public String getName();

    /**
     * Método a implementar
     * @param name
     */
    public void setName(String name);

    /**
     * Método a implementar
     * @return email
     */
    public String getEmail();

    /**
     * Método a implementar
     * @param email
     */
    public void setEmail(String email);

    /**
     * Método a implementar
     * @return password
     */
    public String getPassword();

    /**
     * Método a implementar
     * @param password
     */
    public void setPassword(String password);

}
