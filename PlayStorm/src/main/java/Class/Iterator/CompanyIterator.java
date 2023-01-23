package Class.Iterator;

import Interfaces.IntCompany;
import Interfaces.IntIterator;

/**
 *
 * @author jorge
 */
public class CompanyIterator implements IntIterator {

    private int i;
    private CompanyContainer companyContainer;

    /**
     *
     * @throws Exception
     */
    public CompanyIterator() throws Exception {
        this.companyContainer = new CompanyContainer();
    }

    /**
     *
     * @return
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
     *
     * @return
     */
    @Override
    public IntCompany next() {
        if (this.hasNext()) {
            return companyContainer.companies.get(i++);
        }
        return null;
    }

    /**
     *
     * @param company
     */
    public void addCompany(IntCompany company) {
        companyContainer.companies.add(company);
    }

    /**
     *
     * @param company
     */
    public void deleteCompany(IntCompany company) {
        companyContainer.companies.remove(company);
    }

    /**
     *
     * @return
     */
    @Override
    public IntCompany firstItem() {
        return companyContainer.companies.get(0);
    }

    /**
     *
     * @return
     */
    @Override
    public IntCompany lastItem() {
        return companyContainer.companies.get(companyContainer.companies.size() - 1);
    }
}
