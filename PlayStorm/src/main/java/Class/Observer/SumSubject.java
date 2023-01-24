package Class.Observer;

import Interfaces.Subject;
import Interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la intefaz Subject y utiliza el patrón Observer
 */
public class SumSubject implements Subject {

    /**
     * Declaración de variables
     */
    private List<Observer> observers;
    private float clientData;
    private float externalData;

    /**
     * Constructor de SumSubject
     */
    public SumSubject() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Guarda el observador
     *
     * @param observer, observador a añadir
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Elimina el observador
     *
     * @param observer, observador a eliminar
     */
    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    /**
     * Notificar al cliente del cambio
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(clientData, externalData);
        }
    }

    /**
     * Guardar el dinero del cliente
     *
     * @param data, dinero del cliente
     */
    public void getClientData(float data) {
        this.clientData = data;
        notifyObservers();
    }

    /**
     * Guardar el dinero a añadir
     *
     * @param data, dinero escrito por el cliente
     */
    public void getExternalData(float data) {
        this.externalData = data;
        notifyObservers();
    }
}
