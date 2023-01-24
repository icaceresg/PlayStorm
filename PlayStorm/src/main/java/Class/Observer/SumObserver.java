package Class.Observer;

import Interfaces.Observer;
import Class.Client;
import Class.DataBase;
import Class.Iterator.ClientIterator;
import Interfaces.IntClient;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa la intefaz Observer y utiliza el patrón Observer
 */
public class SumObserver implements Observer {

    /**
     * Declaración de variables
     */
    private float sum;

    /**
     * Actualiza el nuevo dinero del cliente
     *
     * @param clientMoney, dinero del cliente
     * @param addedMoney, dinero a añadir
     */
    @Override
    public void update(float clientMoney, float addedMoney) {
        sum = clientMoney + addedMoney;
        setMoney();
    }

    /**
     * Guarda el nuevo dinero del cliente
     */
    public void setMoney() {
        try {
            String email = Client.activeUser.get(0).getEmail();
            ClientIterator iterator = new ClientIterator();
            while (iterator.hasNext()) {
                IntClient client = iterator.next();
                if (client.getEmail().equals(email)) {
                    client.setWallet(sum);
                }
            }
            DataBase database = new DataBase();
            database.saveIteratorClient(iterator);

        } catch (Exception ex) {
            Logger.getLogger(SumObserver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
