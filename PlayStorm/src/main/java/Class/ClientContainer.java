
package Class;

import Interfaces.IntContainer;
import Interfaces.IntIterator;
import Class.Client;
import java.util.ArrayList;

public class ClientContainer implements IntContainer{
    public ArrayList<Client> clients = new ArrayList<>();
    
    
    public ClientContainer()
    {
        clients.add(new Client("a","a","a","a","a","a","a"));
        clients.add(new Client("b","b","b","b","b","b","b"));
        
        //this.clientes = serializable.leerClientes();
    }

    @Override
    public IntIterator createIterator() {
        return new ClientIterator();
    }
}
