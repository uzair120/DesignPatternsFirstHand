package A_Duck_Strategy.core;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    Duck(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void display();

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void canSwim() {
        System.out.println("All Ducks can swim. No Big deal");
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

}
