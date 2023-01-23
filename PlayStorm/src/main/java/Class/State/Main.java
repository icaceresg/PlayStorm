package Class.State;

import Class.AbstractFactory.TemplateMethod.NotSubscriberClient;
import Class.AbstractFactory.TemplateMethod.NotSubscriberCompany;
import Class.Product;
import Interfaces.IntUser;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            NotSubscriberClient client = new NotSubscriberClient("name", "correo", "1234", "villarreal", "location", "1231231231231231", "telefono", "12/7/2001");
            NotSubscriberCompany company = new NotSubscriberCompany("name", "correo", "1234", "location", "1234");
            Product producto = new Product("titulo", "descripcion", 20, "categoria", company);
            Product producto2 = new Product("titulo2", "descripcion2", 20, "categoria2", company);
            
            Order order = Order.getInstance(client);
            order.addProduct(producto);
            order.addProduct(producto2);
            
            order.deleteProduct(producto);
            
            order.process(); // prints "Order is being processed"
            System.out.println(order.getStatus());
            order.setState(new ProcessingOrderState());
            System.out.println(order.getStatus());
            order.finish(); // prints "Order processing cannot be canceled"
            System.out.println(order.getStatus());
            
            for(int i = 0; i < order.getProduct().size(); i++){
                System.out.println("Producto: " + order.getProduct().get(i).getTitle() + " Empresa: " + order.getProduct().get(i).getCompany().getName() + "Cliente: " + order.getClient().getName());
            }
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
