package Class.Adapter;

import java.security.MessageDigest;

/**
 * Clase que se encarga de la encriptación del Adapter
 */
public class PasswordAdapter extends PasswordEncode {

    /**
     * Declaración de variables
     */
    private Password password;

    /**
     * Guarda la contraseña
     *
     * @param pass, contraseña nueva
     */
    public PasswordAdapter(Password pass) {
        this.password = pass;
    }

    /**
     * Cifra la contraseña
     *
     * @return cifrado, contraseña cifrada
     */
    @Override
    public String getEncode() {
        String cifrado;
        cifrado = password.getPassword();
        cifrado = encodeSHA256(cifrado);
        return cifrado;
    }

    /**
     * Método para cifrar la contraseña
     *
     * @param pass, contraseña a cifrar
     * @return contraseña cifrada
     */
    public static String encodeSHA256(String pass) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(pass.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
