package D_PizzaStore_Factory.factory.core;

public class ChicagoCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing ChicagoCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking ChicagoCheesePizza");

    }

    @Override
    public void cut() {
        System.out.println("Cutting ChicagoCheesePizza");

    }

    @Override
    public void box() {
        System.out.println("Boxing ChicagoCheesePizza");

    }
}
