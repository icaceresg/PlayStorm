package Interfaces;

public interface UserFactory {

    IntCompany createCompany(String name, String email, String password, String site, String cif);

    IntClient createClient(String name, String email, String password, String lastName, String site, String creditCard, String phone, String birthday);

}
