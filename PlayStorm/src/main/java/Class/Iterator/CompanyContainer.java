package Class.Iterator;

import Class.DataBase;
import Interfaces.IntCompany;
import Interfaces.IntContainer;
import Interfaces.IntIterator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class CompanyContainer implements IntContainer, Serializable {

    /**
     *
     */
    public ArrayList<IntCompany> companies = new ArrayList<>();

    /**
     *
     * @throws Exception
     */
    public CompanyContainer() throws Exception {
        this.companies = new DataBase().readCompanies();
    }

    /**
     *
     * @return
     */
    @Override
    public IntIterator createIterator() {
        try {
            return new CompanyIterator();
        } catch (Exception ex) {
            Logger.getLogger(CompanyContainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
