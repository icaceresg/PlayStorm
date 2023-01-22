package Class.Proxy;

import Interfaces.IntAdmin;

public class Demo {

    public static void main(String[] args) {
        IntAdmin adminProxy = new AdminProxy();
        adminProxy.deleteClient("correo@electronico");
    }

}
