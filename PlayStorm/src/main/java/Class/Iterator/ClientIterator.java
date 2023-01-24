package Class.Iterator;

import Interfaces.IntIterator;
import Interfaces.IntClient;

/**
 * Clase que implementa la interfaz IntIterator y se encarga de seleccionar un
 * cliente del contenedor
 */
public class ClientIterator implements IntIterator {

    /**
     * Declaración de variables
     */
    private int i;
    private ClientContainer clientContainer;

    /**
     * Creación del iterador
     *
     * @throws Exception
     */
    public ClientIterator() throws Exception {
        this.clientContainer = new ClientContainer();
    }

    /**
     * Devuelve si hay un cliente más en el contenedor
     *
     * @return boolean
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
     * Devuelve el cliente siguiente
     *
     * @return client, siguiente cliente
     */
    @Override
    public IntClient next() {
        if (this.hasNext()) {
            return clientContainer.clients.get(i++);
        }
        return null;
    }

    /**
     * Añade un cliente al contenedor
     *
     * @param client, cliente nuevo
     */
    public void addClient(IntClient client) {
        clientContainer.clients.add(client);
    }

    /**
     * Elimina un cliente
     *
     * @param client, cliente que eliminar
     */
    public void deleteClient(IntClient client) {
        clientContainer.clients.remove(client);
    }

    /**
     * Devuelve el primer cliente
     *
     * @return client, primer cliente
     */
    @Override
    public IntClient firstItem() {
        return clientContainer.clients.get(0);
    }

    /**
     * Devuelve el último cliente
     *
     * @return client, último cliente
     */
    @Override
    public IntClient lastItem() {
        return clientContainer.clients.get(clientContainer.clients.size() - 1);
    }
}
