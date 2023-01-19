/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Iterator;

import Class.Client;
import Class.Company;
import Class.DataBase;
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
public class CompanyContainer implements IntContainer, Serializable{
    public ArrayList<Company> companies = new ArrayList<>();
    
    
    public CompanyContainer() throws Exception
    {
        //clients.add(new Client("a","a","a","a","a","a","a"));
        //clients.add(new Client("b","b","b","b","b","b","b"));
        
        this.companies = new DataBase().readCompanies();
    }

    @Override
    public IntIterator createIterator() {
        try {
            return new ClientIterator();
        } catch (Exception ex) {
            Logger.getLogger(CompanyContainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}