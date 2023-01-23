package Class.Adapter;

/**
 *
 * @author jorge
 */
public class PasswordEncode {

    private String password;

    /**
     *
     */
    public PasswordEncode() {
    }

    /**
     *
     * @param pass
     */
    public PasswordEncode(String pass) {
        this.password = pass;
    }

    /**
     *
     * @return
     */
    public String getEncode() {
        return password;
    }

    /**
     *
     * @param passwordEncode
     * @return
     */
    public String save(PasswordEncode passwordEncode) {

        return passwordEncode.getEncode();
    }
}
