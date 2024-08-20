package A_Duck_Strategy.core;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("FlyNoWay Called");
    }
}
