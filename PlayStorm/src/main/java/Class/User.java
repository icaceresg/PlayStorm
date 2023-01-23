package Class;

import Interfaces.IntUser;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que implementa la interfaz IntUser y Serializable para guardar datos
 */
public class User implements IntUser, Serializable {

    /**
     * Declaración de variables
     */
    public static ArrayList<IntUser> activeUser = new ArrayList<IntUser>();
    private String name, email, password;

    /**
     * Constructor del Usuario
     *
     * @param name, nombre
     * @param email, correo
     * @param password, contraseña
     */
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * Devuelve el nombre del usuario
     *
     * @return name, nombre del usuario
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Guarda el nombre del usuario
     *
     * @param name, nombre del usuario
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el correo del usuario
     *
     * @return email, correo del usuario
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     * Guarda el correo del usuario
     *
     * @param email, correo del usuario
     */
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve la contraseña del usuario
     *
     * @return password, contraseña del usuario
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * Guarda la contraseña del usuario
     *
     * @param password, contraseña del usuario
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
