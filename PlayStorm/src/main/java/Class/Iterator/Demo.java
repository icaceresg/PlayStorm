/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class.Iterator;

import Class.Client;
import Class.DataBase;
import Class.Iterator.ClientIterator;

/**
 *
 * @author icace
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws Exception {
        DataBase database= new DataBase();
        database.saveClient(new Client("bbsita","a","a","a","a","a","a"));
        ClientIterator iterator = new ClientIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().getName());
    }
    
}
