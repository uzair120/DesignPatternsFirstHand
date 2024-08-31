package L_Patterns.vanilla.strategy;

import L_Patterns.vanilla.observer.Observable;
import L_Patterns.vanilla.observer.Observer;

public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
