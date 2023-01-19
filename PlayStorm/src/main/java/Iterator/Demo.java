/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import Class.ClientIterator;

/**
 *
 * @author icace
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientIterator iterator = new ClientIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().getName());
    }
    
}
