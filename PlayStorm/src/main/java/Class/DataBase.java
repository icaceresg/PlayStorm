package Class;

import Class.Iterator.ClientIterator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author AdriiM_
 */
public class DataBase {

    private String ruta = "./database/";

    public void saveClient(Client client) throws IOException, Exception {
        File file = new File(ruta, "Clients.txt");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            ClientIterator iterator = new ClientIterator();
            System.out.println(client.getName());
            oos.writeObject(client);
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

    public ArrayList<Client> readClients() throws Exception {
        File file = new File(ruta, "Clients.txt");
        ArrayList<Client> clients = new ArrayList();
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Object aux = ois.readObject();
            do {
                if (aux instanceof Client) {
                    clients.add((Client) aux);
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

}
