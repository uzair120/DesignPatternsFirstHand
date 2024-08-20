package D_PizzaStore_Factory.factory.core;

public class NYCheesePizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking NYCheesePizza");
    }

    @Override
    public void prepare() {
        System.out.println("Prepare NYCheesePizza");

    }

    @Override
    public void box() {
        System.out.println("Boxing NYCheesePizza");

    }

    @Override
    public void cut() {
        System.out.println("Cutting NYCheesePizza");

    }
}
