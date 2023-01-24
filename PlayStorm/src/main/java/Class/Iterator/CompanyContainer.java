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
 * Clase que implementa la interfaz IntContainer y la clase Serializable
 */
public class CompanyContainer implements IntContainer, Serializable {

    /**
     * Declaración de variables
     */
    public ArrayList<IntCompany> companies = new ArrayList<>();

    /**
     * Constructor del contenedor de empresas
     *
     * @throws Exception
     */
    public CompanyContainer() throws Exception {
        this.companies = new DataBase().readCompanies();
    }

    /**
     * Creación del iterador
     *
     * @return iterator, el iterador
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
