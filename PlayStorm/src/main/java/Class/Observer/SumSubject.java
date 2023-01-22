package Class.Observer;

import Interfaces.Subject;
import Interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

public class SumSubject implements Subject {

    private List<Observer> observers;
    private float clientData;
    private float externalData;

    public SumSubject() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(clientData, externalData);
        }
    }

    public void getClientData(float data) {
        this.clientData = data;
        notifyObservers();
    }

    public void getExternalData(float data) {
        this.externalData = data;
        notifyObservers();
    }
}
