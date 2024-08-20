package D_PizzaStore_Factory.abstract_factory;

import D_PizzaStore_Factory.abstract_factory.core.Pizza;
import D_PizzaStore_Factory.abstract_factory.core.PizzaStore;
import D_PizzaStore_Factory.abstract_factory.core.pizza.ChicagoCheesePizza;
import D_PizzaStore_Factory.abstract_factory.core.pizza.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza(chicagoPizzaIngredientFactory);
        } else if (type.equals("veg")) {
            return new ChicagoVeggiePizza(chicagoPizzaIngredientFactory);
        }
        System.out.println("NOT FOUND");
        return null;
    }
}
