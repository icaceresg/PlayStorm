/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Iterator;

import Class.Company;
import Interfaces.IntCompany;
import Interfaces.IntIterator;

/**
 *
 * @author jorge
 */
public class CompanyIterator implements IntIterator{
    private int i;
    private CompanyContainer companyContainer;

    public CompanyIterator() throws Exception {
        this.companyContainer = new CompanyContainer();
    }

    @Override
    public boolean hasNext() {
        if(i < companyContainer.companies.size())
            return true;
        return false;
    }

    @Override
    public IntCompany next() {
        if(this.hasNext())
            return companyContainer.companies.get(i++);
        return null;
    }
    
    public void addCompany(IntCompany company)
    {
        companyContainer.companies.add(company);
    }
    
}
