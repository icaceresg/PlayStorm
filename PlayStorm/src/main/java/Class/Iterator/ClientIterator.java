package Class.Iterator;

import Interfaces.IntIterator;
import Interfaces.IntClient;

/**
 *
 * @author jorge
 */
public class ClientIterator implements IntIterator {

    private int i;
    private ClientContainer clientContainer;

    /**
     *
     * @throws Exception
     */
    public ClientIterator() throws Exception {
        this.clientContainer = new ClientContainer();
    }

    /**
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        if (i < clientContainer.clients.size()) {
            return true;
        }
        i = 0;
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public IntClient next() {
        if (this.hasNext()) {
            return clientContainer.clients.get(i++);
        }
        return null;
    }

    /**
     *
     * @param client
     */
    public void addClient(IntClient client) {
        clientContainer.clients.add(client);
    }

    /**
     *
     * @param client
     */
    public void deleteClient(IntClient client) {
        clientContainer.clients.remove(client);
    }

    /**
     *
     * @return
     */
    @Override
    public IntClient firstItem() {
        return clientContainer.clients.get(0);
    }

    /**
     *
     * @return
     */
    @Override
    public IntClient lastItem() {
        return clientContainer.clients.get(clientContainer.clients.size() - 1);
    }
}
