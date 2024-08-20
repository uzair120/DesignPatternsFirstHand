package D_PizzaStore_Factory.factory.core;

public class ChicagoVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing ChicagoVeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking ChicagoVeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting ChicagoVeggiePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing ChicagoVeggiePizza");
    }
}
