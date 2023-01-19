/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author jorge
 */
public interface UserFactory {

    IntCompany createCompany(String name, String email, String password, String site, String cif, boolean subscribe);

    IntClient createClient(String name, String email, String password, String lastName, String site, String creditCard, String phone);

}
