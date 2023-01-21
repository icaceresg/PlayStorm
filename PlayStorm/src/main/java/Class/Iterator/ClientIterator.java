package Class.Iterator;

import Interfaces.IntIterator;
import Interfaces.IntClient;

public class ClientIterator implements IntIterator {

    private int i;
    private ClientContainer clientContainer;

    public ClientIterator() throws Exception {
        this.clientContainer = new ClientContainer();
    }

    @Override
    public boolean hasNext() {
        if (i < clientContainer.clients.size()) {
            return true;
        }
        i = 0;
        return false;
    }

    @Override
    public IntClient next() {
        if (this.hasNext()) {
            return clientContainer.clients.get(i++);
        }
        return null;
    }

    public void addClient(IntClient client) {
        clientContainer.clients.add(client);
    }

    public void deleteClient(IntClient client) {
        clientContainer.clients.remove(client);
    }

    @Override
    public IntClient firstItem() {
        return clientContainer.clients.get(0);
    }

    @Override
    public IntClient lastItem() {
        return clientContainer.clients.get(clientContainer.clients.size() - 1);
    }
}
