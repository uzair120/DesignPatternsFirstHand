package D_PizzaStore_Factory.factory;

import D_PizzaStore_Factory.factory.core.ChicagoCheesePizza;
import D_PizzaStore_Factory.factory.core.ChicagoVeggiePizza;
import D_PizzaStore_Factory.factory.core.Pizza;
import D_PizzaStore_Factory.factory.core.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else if (type.equals("veg")) {
            return new ChicagoVeggiePizza();
        }
        System.out.println("NOT FOUND");
        return null;
    }
}
