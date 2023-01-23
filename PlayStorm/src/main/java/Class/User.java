package Class;

import Interfaces.IntUser;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class User implements IntUser, Serializable {

    /**
     *
     */
    public static ArrayList<IntUser> activeUser = new ArrayList<IntUser>();

    private String name, email, password;

    /**
     *
     * @param name
     * @param email
     * @param password
     */
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    @Override
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
