
package Class.Iterator;

import Interfaces.IntIterator;
import Class.Client;
import Class.Client;
import Interfaces.IntClient;

public class ClientIterator implements IntIterator{
    private int i;
    private ClientContainer clientContainer;

    public ClientIterator() throws Exception {
        this.clientContainer = new ClientContainer();
    }

    @Override
    public boolean hasNext() {
        if(i < clientContainer.clients.size())
            return true;
        return false;
    }

    @Override
    public IntClient next() {
        if(this.hasNext())
            return clientContainer.clients.get(i++);
        return null;
    }
    
    public void addClient(IntClient client)
    {
        clientContainer.clients.add(client);
    }
    
}
