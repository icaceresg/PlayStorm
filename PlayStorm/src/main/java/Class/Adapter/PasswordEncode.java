package Class.Adapter;

/**
 * Clase para la contraseña cifrada para el Adapter
 */
public class PasswordEncode {

    /**
     * Declaración de variables
     */
    private String password;

    /**
     * Constructor vacío
     */
    public PasswordEncode() {
    }

    /**
     * Guarda la nueva contraseña
     *
     * @param pass, contraseña cifrada
     */
    public PasswordEncode(String pass) {
        this.password = pass;
    }

    /**
     * Devuelve la contraseña cifrada
     *
     * @return password, contraseña cifrada
     */
    public String getEncode() {
        return password;
    }

    /**
     * Guarda la contraseña cifrada
     *
     * @param passwordEncode, contraseña cifrada
     * @return password, contraseña cifrada
     */
    public String save(PasswordEncode passwordEncode) {

        return passwordEncode.getEncode();
    }
}
