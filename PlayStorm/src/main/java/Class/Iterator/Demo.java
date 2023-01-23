package Class.Iterator;

import Class.DataBase;

/**
 *
 * @author jorge
 */
public class Demo {

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        DataBase database = new DataBase();
        ClientIterator iterator = new ClientIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        ProductIterator iteratorProduct = new ProductIterator();
        while (iteratorProduct.hasNext()) {
            System.out.println(iteratorProduct.next().getTitle());
        }

        CompanyIterator iteratorCompany = new CompanyIterator();
        while (iteratorCompany.hasNext()) {
            System.out.println(iteratorCompany.next().getName());
        }
    }
}
