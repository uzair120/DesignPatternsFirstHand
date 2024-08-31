package L_Patterns.vanilla.factory;

import L_Patterns.vanilla.observer.Observable;
import L_Patterns.vanilla.observer.Observer;
import L_Patterns.vanilla.strategy.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<Quackable>();
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.registerObserver(observer);
        }
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
