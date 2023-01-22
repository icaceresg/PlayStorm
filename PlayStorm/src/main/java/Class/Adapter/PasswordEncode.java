package Class.Adapter;

public class PasswordEncode {

    private String password;

    public PasswordEncode() {
    }

    public PasswordEncode(String pass) {
        this.password = pass;
    }

    public String getEncode() {
        return password;
    }

    public String save(PasswordEncode passwordEncode) {

        return passwordEncode.getEncode();
    }
}
