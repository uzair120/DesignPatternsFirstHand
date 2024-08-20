package A_Duck_Strategy.core;

public class FlayWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("FlayWithWings Called");
    }
}
