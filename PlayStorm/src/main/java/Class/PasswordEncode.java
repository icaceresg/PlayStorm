/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

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
