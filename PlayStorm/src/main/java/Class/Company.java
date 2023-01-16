package Class;

import java.util.Map;


public class Company extends Client{
    String site, cif;
    Product [] products;
    float wallet;
    boolean susbscribe;
    Map <String, Integer> discounts; //String to promotional code, int to % discount
    Company [] company; //List to companys
}
