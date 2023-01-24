package Class.Iterator;

import Interfaces.IntCompany;
import Interfaces.IntIterator;

/**
 * Clase que implementa la interfaz IntIterator y se encarga de seleccionar una
 * empresa del contenedor
 */
public class CompanyIterator implements IntIterator {

    /**
     * Declaración de variables
     */
    private int i;
    private CompanyContainer companyContainer;

    /**
     * Creación del iterador
     *
     * @throws Exception
     */
    public CompanyIterator() throws Exception {
        this.companyContainer = new CompanyContainer();
    }

    /**
     * Devuelve si hay una empresa más en el contenedor
     *
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        if (i < companyContainer.companies.size()) {
            return true;
        }
        i = 0;
        return false;
    }

    /**
     * Devuelve la empresa siguiente
     *
     * @return company, siguiente empresa
     */
    @Override
    public IntCompany next() {
        if (this.hasNext()) {
            return companyContainer.companies.get(i++);
        }
        return null;
    }

    /**
     * Añade una empresa al contenedor
     *
     * @param company, empresa nuevo
     */
    public void addCompany(IntCompany company) {
        companyContainer.companies.add(company);
    }

    /**
     * Elimina una empresa
     *
     * @param company, empresa que eliminar
     */
    public void deleteCompany(IntCompany company) {
        companyContainer.companies.remove(company);
    }

    /**
     * Devuelve la primer empresa
     *
     * @return company, primera empresa
     */
    @Override
    public IntCompany firstItem() {
        return companyContainer.companies.get(0);
    }

    /**
     * Devuelve la última empresa
     *
     * @return company, última empresa
     */
    @Override
    public IntCompany lastItem() {
        return companyContainer.companies.get(companyContainer.companies.size() - 1);
    }
}
