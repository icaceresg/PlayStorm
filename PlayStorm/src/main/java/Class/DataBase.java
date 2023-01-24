package Class;

import Class.Iterator.ClientIterator;
import Class.Iterator.CompanyIterator;
import Class.Iterator.OrderIterator;
import Class.Iterator.ProductIterator;
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
 * Clase que se va a encargar almacenar los datos
 */
public class DataBase {

    /**
     * Declaración de variables
     */
    private String path = "./database/";

    /**
     * Guarda el cliente en Clients.txt
     *
     * @param client, cliente que vamos a guardar
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
     * Guarda el iterador del cliente en Client.txt
     *
     * @param iterator, iterador del cliente
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
     * Lee los clientes de Clients.txt
     *
     * @return clients, clientes guardados
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
     * Guarda la empresa en Company.txt
     *
     * @param company, empresa a guardar
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
     * Guarda el iterador en Company.txt
     *
     * @param iterator, iterador de Company
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
     * Lee las empresas guardadas
     *
     * @return companies, empresas guardadas
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
     * Guarda el producto en Product.txt
     *
     * @param product, producto a guardar
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
     * Guarda el iterador en Product.txt
     *
     * @param iterator, iterador de los productos
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
     * Lee los productos guardadas
     *
     * @return products, productos guardados
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
     * Guarda el pedido en Order.txt
     *
     * @param order, pedido a guardar
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
     * Guarda el iterador en Order.txt
     *
     * @param iterator, iterador del pedido
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
     * Lee los pedidos guardados
     *
     * @return orders, pedidos guardados
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
