/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

public class ContraseñaCif {
    private String contraseña;

    public ContraseñaCif() {}

    public ContraseñaCif(String pass) {
        this.contraseña = pass;
    }

    public String getCifrado() {
        return contraseña;
    }
    
    public String fits(ContraseñaCif contraseñaCif) {
        
        return contraseñaCif.getCifrado();
    }
}