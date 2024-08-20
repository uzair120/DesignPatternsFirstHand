package D_PizzaStore_Factory.factory.core;

public class NYVeggiePizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking NYVeggiePizza");
    }

    @Override
    public void prepare() {
        System.out.println("Prepare NYVeggiePizza");

    }

    @Override
    public void box() {
        System.out.println("Boxing NYVeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NYVeggiePizza");

    }
}
