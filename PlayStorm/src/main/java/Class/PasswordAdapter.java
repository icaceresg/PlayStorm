/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.security.MessageDigest;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class PasswordAdapter extends PasswordEncode {

    private Password password;

    public PasswordAdapter(Password pass) {
        this.password = pass;
    }

    @Override
    public String getEncode() {
        String cifrado;
        // Calculate a minimum circle radius, which can fit this peg.
        cifrado = password.getPassword();
        cifrado = encodeSHA256(cifrado);
        return cifrado;
    }

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
