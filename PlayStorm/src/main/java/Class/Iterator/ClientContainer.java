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
 *
 * @author jorge
 */
public class ClientContainer implements IntContainer, Serializable {

    /**
     *
     */
    public ArrayList<IntClient> clients = new ArrayList<>();

    /**
     *
     * @throws Exception
     */
    public ClientContainer() throws Exception {
        this.clients = new DataBase().readClients();
    }

    /**
     *
     * @return
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
