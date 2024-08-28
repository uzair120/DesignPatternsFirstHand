package G_Adapter_Facade.duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Duck Quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck Fly");
    }
}
