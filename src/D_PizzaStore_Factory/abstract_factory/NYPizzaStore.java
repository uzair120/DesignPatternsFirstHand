package D_PizzaStore_Factory.abstract_factory;

import D_PizzaStore_Factory.abstract_factory.core.Pizza;
import D_PizzaStore_Factory.abstract_factory.core.PizzaStore;
import D_PizzaStore_Factory.abstract_factory.core.pizza.NYCheesePizza;
import D_PizzaStore_Factory.abstract_factory.core.pizza.NYVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        NYPizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            return new NYCheesePizza(nyPizzaIngredientFactory);
        } else if (type.equals("veg")) {
            return new NYVeggiePizza(nyPizzaIngredientFactory);
        }
        System.out.println("NOT FOUND");
        return null;
    }
}
