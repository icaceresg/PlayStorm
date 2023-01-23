package Class;

//Singleton pattern
import Class.Iterator.ClientIterator;
import Class.Iterator.CompanyIterator;
import Class.Iterator.ProductIterator;
import Interfaces.IntAdmin;
import Interfaces.IntClient;
import Interfaces.IntCompany;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public final class Administrator extends User implements IntAdmin {

    private static Administrator instance;

    private Administrator() {
        super("admin", "admin@admin", "admin");
    }

    //Call this function to create Administrator user

    /**
     *
     * @return
     */
    public static Administrator getInstance() {
        if (instance == null) {
            instance = new Administrator();
        }
        return instance;
    }

    /**
     *
     * @param email
     */
    @Override
    public void deleteClient(String email) {
        try {
            ClientIterator iterator = new ClientIterator();
            while (iterator.hasNext()) {
                IntClient nextItem = iterator.next();
                if (nextItem.getEmail().equals(email)) {
                    iterator.deleteClient(nextItem);
                }
            }
            new DataBase().saveIteratorClient(iterator);

        } catch (Exception ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param email
     */
    @Override
    public void deleteCompany(String email) {
        try {
            CompanyIterator iterator = new CompanyIterator();
            while (iterator.hasNext()) {
                IntCompany nextItem = iterator.next();
                if (nextItem.getEmail().equals(email)) {
                    iterator.deleteCompany(nextItem);
                }
            }
            new DataBase().saveIteratorCompany(iterator);
        } catch (Exception ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param id
     */
    @Override
    public void deleteProduct(int id) {
        try {
            ProductIterator iterator = new ProductIterator();
            while (iterator.hasNext()) {
                Product nextItem = iterator.next();
                if (nextItem.getId() == id) {
                    iterator.deleteProduct(nextItem);
                }
            }
            new DataBase().saveIteratorProduct(iterator);
        } catch (Exception ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
