
package Class.Iterator;

import Interfaces.IntContainer;
import Interfaces.IntIterator;
import Class.Client;
import Class.Client;
import Class.DataBase;
import java.util.ArrayList;

public class ClientContainer implements IntContainer{
    public ArrayList<Client> clients = new ArrayList<>();
    
    
    public ClientContainer() throws Exception
    {
        //clients.add(new Client("a","a","a","a","a","a","a"));
        //clients.add(new Client("b","b","b","b","b","b","b"));
        
        this.clients = new DataBase().readClients();
    }

    @Override
    public IntIterator createIterator() {
        return new ClientIterator();
    }
}
