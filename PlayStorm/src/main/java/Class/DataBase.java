package Class;

import Class.Iterator.ClientIterator;
import Class.Iterator.CompanyIterator;
import Class.Iterator.OrderIterator;
import Class.Iterator.ProductIterator;
import Class.State.Order;
import Interfaces.IntClient;
import Interfaces.IntCompany;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class DataBase {

    private String path = "./database/";

    /**
     *
     * @param client
     * @throws IOException
     * @throws Exception
     */
    public void saveClient(IntClient client) throws IOException, Exception {
        ClientIterator iterator = new ClientIterator();
        iterator.addClient(client);
        File file = new File(path, "Clients.txt");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            while (iterator.hasNext()) {
                oos.writeObject(iterator.next());
            }

        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            throw new Exception(ei.getMessage());
        } finally {
            if (oos != null) {
                oos.close();
            }
        }

    }

    /**
     *
     * @param iterator
     * @throws IOException
     * @throws Exception
     */
    public void saveIteratorClient(ClientIterator iterator) throws IOException, Exception {
        File file = new File(path, "Clients.txt");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            while (iterator.hasNext()) {
                oos.writeObject(iterator.next());
            }

        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            throw new Exception(ei.getMessage());
        } finally {
            if (oos != null) {
                oos.close();
            }
        }

    }

    /**
     *
     * @return
     * @throws Exception
     */
    public ArrayList<IntClient> readClients() throws Exception {
        File file = new File(path, "Clients.txt");
        ArrayList<IntClient> clients = new ArrayList();
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Object aux = ois.readObject();
            do {
                if (aux instanceof IntClient) {
                    clients.add((IntClient) aux);
                }
                aux = ois.readObject();
            } while (aux != null);
        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            //throw new Exception(ei.getMessage());
        } finally {
            if (ois != null) {
                ois.close();
            }
        }
        return clients;
    }

    /**
     *
     * @param company
     * @throws IOException
     * @throws Exception
     */
    public void saveCompanies(IntCompany company) throws IOException, Exception {
        CompanyIterator iterator = new CompanyIterator();
        iterator.addCompany(company);
        File file = new File(path, "Company.txt");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            while (iterator.hasNext()) {
                oos.writeObject(iterator.next());
            }

        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            throw new Exception(ei.getMessage());
        } finally {
            if (oos != null) {
                oos.close();
            }
        }

    }

    /**
     *
     * @param iterator
     * @throws IOException
     * @throws Exception
     */
    public void saveIteratorCompany(CompanyIterator iterator) throws IOException, Exception {
        File file = new File(path, "Company.txt");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            while (iterator.hasNext()) {
                oos.writeObject(iterator.next());
            }

        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            throw new Exception(ei.getMessage());
        } finally {
            if (oos != null) {
                oos.close();
            }
        }

    }

    /**
     *
     * @return
     * @throws Exception
     */
    public ArrayList<IntCompany> readCompanies() throws Exception {
        File file = new File(path, "Company.txt");
        ArrayList<IntCompany> companies = new ArrayList();
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Object aux = ois.readObject();
            do {
                if (aux instanceof IntCompany) {
                    companies.add((IntCompany) aux);
                }
                aux = ois.readObject();
            } while (aux != null);
        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            //throw new Exception(ei.getMessage());
        } finally {
            if (ois != null) {
                ois.close();
            }
        }
        return companies;
    }

    /**
     *
     * @param product
     * @throws IOException
     * @throws Exception
     */
    public void saveProducts(Product product) throws IOException, Exception {
        ProductIterator iterator = new ProductIterator();
        iterator.addProducts(product);
        File file = new File(path, "Product.txt");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            while (iterator.hasNext()) {
                oos.writeObject(iterator.next());
            }

        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            throw new Exception(ei.getMessage());
        } finally {
            if (oos != null) {
                oos.close();
            }
        }

    }

    /**
     *
     * @param iterator
     * @throws IOException
     * @throws Exception
     */
    public void saveIteratorProduct(ProductIterator iterator) throws IOException, Exception {
        File file = new File(path, "Product.txt");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            while (iterator.hasNext()) {
                oos.writeObject(iterator.next());
            }

        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            throw new Exception(ei.getMessage());
        } finally {
            if (oos != null) {
                oos.close();
            }
        }

    }

    /**
     *
     * @return
     * @throws Exception
     */
    public ArrayList<Product> readProducts() throws Exception {
        File file = new File(path, "Product.txt");
        ArrayList<Product> products = new ArrayList();
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Object aux = ois.readObject();
            do {
                if (aux instanceof Product) {
                    products.add((Product) aux);
                }
                aux = ois.readObject();
            } while (aux != null);
        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            //throw new Exception(ei.getMessage());
        } finally {
            if (ois != null) {
                ois.close();
            }
        }
        return products;
    }

    /**
     *
     * @param order
     * @throws IOException
     * @throws Exception
     */
    public void saveOrders(Order order) throws IOException, Exception {
        OrderIterator iterator = new OrderIterator();
        iterator.addOrder(order);
        File file = new File(path, "Order.xt");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            while (iterator.hasNext()) {
                oos.writeObject(iterator.next());
            }

        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            throw new Exception(ei.getMessage());
        } finally {
            if (oos != null) {
                oos.close();
            }
        }

    }

    /**
     *
     * @param iterator
     * @throws IOException
     * @throws Exception
     */
    public void saveIteratorOrder(OrderIterator iterator) throws IOException, Exception {
        File file = new File(path, "Order.txt");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            while (iterator.hasNext()) {
                oos.writeObject(iterator.next());
            }

        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            throw new Exception(ei.getMessage());
        } finally {
            if (oos != null) {
                oos.close();
            }
        }

    }

    /**
     *
     * @return
     * @throws Exception
     */
    public ArrayList<Order> readOrder() throws Exception {
        File file = new File(path, "Order.txt");
        ArrayList<Order> orders = new ArrayList();
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Object aux = ois.readObject();
            do {
                if (aux instanceof Order) {
                    orders.add((Order) aux);
                }
                aux = ois.readObject();
            } while (aux != null);
        } catch (FileNotFoundException ef) {
            throw new Exception(ef.getMessage());
        } catch (IOException ei) {
            //throw new Exception(ei.getMessage());
        } finally {
            if (ois != null) {
                ois.close();
            }
        }
        return orders;
    }

}
