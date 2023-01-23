package Class.Proxy;

import Interfaces.IntAdmin;

/**
 *
 * @author jorge
 */
public class Demo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        IntAdmin adminProxy = new AdminProxy();
        adminProxy.deleteClient("correo@electronico");
    }

}
