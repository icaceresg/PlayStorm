package Class;

//Singleton pattern

import Class.Iterator.ClientIterator;
import Class.Iterator.CompanyIterator;
import Class.Iterator.ProductIterator;
import Class.Proxy.AdminFunctionsImpl;
import Class.Proxy.IntAdmin;
import Interfaces.IntClient;
import Interfaces.IntCompany;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Administrator extends User implements IntAdmin{

    private static Administrator instance;

    private Administrator() {
        super("admin", "admin@admin", "admin");
    }

    //Call this function to create Administrator user
    public static Administrator getInstance() {
        if (instance == null) {
            instance = new Administrator();
        }
        return instance;
    }
    
    @Override
    public void deleteClient(String email) {
        try {
            ClientIterator iterator = new ClientIterator();
            while (iterator.hasNext())
            {
                IntClient nextItem = iterator.next();
                if (nextItem.getEmail().equals(email))
                    iterator.deleteClient(nextItem);
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(AdminFunctionsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteCompany(String email) {
        try {
            CompanyIterator iterator = new CompanyIterator();
            while (iterator.hasNext())
            {
                IntCompany nextItem = iterator.next();
                if (nextItem.getEmail().equals(email))
                    iterator.deleteCompany(nextItem);
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(AdminFunctionsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteProduct(Product product) {
        try {
            ProductIterator iterator = new ProductIterator();
            while (iterator.hasNext())
            {
                Product nextItem = iterator.next();
                if (nextItem.getId() == product.getId())
                    iterator.deleteProduct(nextItem);
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(AdminFunctionsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
