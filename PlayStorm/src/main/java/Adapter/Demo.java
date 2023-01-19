/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Adapter;

/**
 *
 * @author jorge
 */
public class Demo {
    public static void main(String[] args) {
        String contraseñaCifrada;
        // Round fits round, no surprise.
        ContraseñaCif rpeg = new ContraseñaCif();
        
        Contraseña smallSqPeg = new Contraseña("hola");
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        ContraseñaAdapter smallSqPegAdapter = new ContraseñaAdapter(smallSqPeg);

        contraseñaCifrada = rpeg.fits(smallSqPegAdapter);
    }
}