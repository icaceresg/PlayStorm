
package Class.Iterator;

import Interfaces.IntIterator;
import Class.Client;
import Class.Client;

public class ClientIterator implements IntIterator{
    private int i;
    private ClientContainer clientContainer = new ClientContainer();

    @Override
    public boolean hasNext() {
        if(i < clientContainer.clients.size())
            return true;
        return false;
    }

    @Override
    public Client next() {
        if(this.hasNext())
            return clientContainer.clients.get(i++);
        return null;
    }
    
}
