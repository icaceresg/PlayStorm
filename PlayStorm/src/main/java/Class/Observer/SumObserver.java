package Class.Observer;

import Interfaces.Observer;
import Class.Client;
import Class.DataBase;
import Class.Iterator.ClientIterator;
import Interfaces.IntClient;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class SumObserver implements Observer {

    private float sum;

    /**
     *
     * @param clientMoney
     * @param addedMoney
     */
    @Override
    public void update(float clientMoney, float addedMoney) {
        sum = clientMoney + addedMoney;
        setMoney();
    }

    /**
     *
     */
    public void setMoney() {
        try {
            String email = Client.activeUser.get(0).getEmail();

            //Iterador + guardar en base de datos
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
