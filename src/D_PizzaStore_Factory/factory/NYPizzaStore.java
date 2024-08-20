package D_PizzaStore_Factory.factory;

import D_PizzaStore_Factory.factory.core.NYCheesePizza;
import D_PizzaStore_Factory.factory.core.NYVeggiePizza;
import D_PizzaStore_Factory.factory.core.Pizza;
import D_PizzaStore_Factory.factory.core.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("veg")) {
            return new NYVeggiePizza();
        }
        System.out.println("NOT FOUND");
        return null;
    }
}
