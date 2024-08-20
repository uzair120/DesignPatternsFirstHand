package A_Duck_Strategy.core;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("MuteQuack Called");
    }
}
