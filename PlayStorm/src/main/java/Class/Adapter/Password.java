package Class.Adapter;

/**
 * Clase de la contraseña para el Adapter
 */
public class Password {

    private String password;

    /**
     * Guarda la contraseña dada
     *
     * @param pass, contraseña nueva
     */
    public Password(String pass) {
        this.password = pass;
    }

    /**
     * Devuelve la contraseña
     *
     * @return password, contraseña del usuario
     */
    public String getPassword() {
        return password;
    }
}
