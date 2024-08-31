package L_Patterns.vanilla.strategy;

import L_Patterns.vanilla.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
