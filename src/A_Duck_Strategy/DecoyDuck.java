package A_Duck_Strategy;

import A_Duck_Strategy.core.Duck;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Display Decoy Duck");
    }
}
