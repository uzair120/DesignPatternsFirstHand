package L_Patterns.vanilla.strategy;

import L_Patterns.vanilla.observer.Observable;
import L_Patterns.vanilla.observer.Observer;

public class QuackCounter implements Quackable {
    static int numberOfQuacks;
    Quackable duck;
    Observable observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(duck);

    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();

    }
}
