package Class.Iterator;

import Interfaces.IntContainer;
import Interfaces.IntIterator;
import Class.DataBase;
import Interfaces.IntClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa la interfaz IntContainer y la clase Serializable
 */
public class ClientContainer implements IntContainer, Serializable {

    /**
     * Declaración de variables
     */
    public ArrayList<IntClient> clients = new ArrayList<>();

    /**
     * Constructor del contenedor de clientes
     *
     * @throws Exception
     */
    public ClientContainer() throws Exception {
        this.clients = new DataBase().readClients();
    }

    /**
     * Creación del iterador
     *
     * @return iterator, el iterador
     */
    @Override
    public IntIterator createIterator() {
        try {
            return new ClientIterator();
        } catch (Exception ex) {
            Logger.getLogger(ClientContainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
