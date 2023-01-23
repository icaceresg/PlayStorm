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
 * Esta clase implementa la interfaz IntAdmin y extiende de la clase Usuario
 */
public final class Administrator extends User implements IntAdmin {

    /**
     * Creamos una instancia Administrador para poder utilizar el patrón
     * Singleton
     */
    private static Administrator instance;

    /**
     * Constructor ya inicializado porque solo puede haber un administrador
     */
    private Administrator() {
        super("admin", "admin@admin", "admin");
    }

    /**
     * Devuelve la instancia del Administrador
     *
     * @return instance, instancia del Administrador
     */
    public static Administrator getInstance() {
        if (instance == null) {
            instance = new Administrator();
        }
        return instance;
    }

    /**
     * Elimina el cliente a través del email
     *
     * @param email, correo del cliente a eliminar
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
     * Elimina la empresa a través del correo
     *
     * @param email, correo de la empresa a eliminar
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
     * Elimina un producto por su ID
     *
     * @param id, identificador del producto a eliminar
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
