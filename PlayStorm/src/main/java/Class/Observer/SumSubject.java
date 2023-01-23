package Class.Observer;

import Interfaces.Subject;
import Interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class SumSubject implements Subject {

    private List<Observer> observers;
    private float clientData;
    private float externalData;

    /**
     *
     */
    public SumSubject() {
        observers = new ArrayList<Observer>();
    }

    /**
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    /**
     *
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(clientData, externalData);
        }
    }

    /**
     *
     * @param data
     */
    public void getClientData(float data) {
        this.clientData = data;
        notifyObservers();
    }

    /**
     *
     * @param data
     */
    public void getExternalData(float data) {
        this.externalData = data;
        notifyObservers();
    }
}
