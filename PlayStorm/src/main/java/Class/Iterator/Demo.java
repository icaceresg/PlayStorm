/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Iterator;

import Class.DataBase;

/**
 *
 * @author icace
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        DataBase database = new DataBase();
        //database.saveClient(new Client("amor","a","a","a","a","a","a"));
        //database.saveClient(new Client("hola","a","a","a","a","a","a"));
        ClientIterator iterator = new ClientIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        //database.saveProducts(new Product("amor", "a", 2, 2));
        //database.saveProducts(new Product("hola", "a", 2, 2));
        ProductIterator iteratorProduct = new ProductIterator();
        while (iteratorProduct.hasNext()) {
            System.out.println(iteratorProduct.next().getTitle());
        }

        //database.saveCompanies(new Company("amor", "a", "a", "a", "a", false));
        //database.saveCompanies(new Company("hola", "a", "a", "a", "a", true));
        CompanyIterator iteratorCompany = new CompanyIterator();
        while (iteratorCompany.hasNext()) {
            System.out.println(iteratorCompany.next().getName());
        }
    }
}
