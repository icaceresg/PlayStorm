
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author icace
 */
public class Person implements Serializable{
    String name1, name2;
    int edad;

    public Person(String name1, int edad, String name2) {
        this.name1 = name1;
        this.name2 = name2;
        this.edad = edad;
    }
    
    
}
