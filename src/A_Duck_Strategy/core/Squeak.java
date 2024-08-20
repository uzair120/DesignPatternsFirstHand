package A_Duck_Strategy.core;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Called");

    }
}
