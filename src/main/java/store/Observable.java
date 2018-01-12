package store;

import java.util.ArrayList;

public class Observable {
    public ArrayList<Observer> observers;

    void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    void notifyObservers() {
        for(Observer observer : this.observers) {
            observer.update();
        }
    }

    Observable() {
        this.observers = new ArrayList<>();
    }
}
