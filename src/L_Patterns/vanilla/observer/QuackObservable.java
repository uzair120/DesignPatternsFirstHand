package L_Patterns.vanilla.observer;


public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}