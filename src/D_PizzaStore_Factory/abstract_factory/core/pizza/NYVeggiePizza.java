package D_PizzaStore_Factory.abstract_factory.core.pizza;

import D_PizzaStore_Factory.abstract_factory.core.Pizza;
import D_PizzaStore_Factory.abstract_factory.core.PizzaIngredientFactory;
import D_PizzaStore_Factory.abstract_factory.core.clams.Clams;
import D_PizzaStore_Factory.abstract_factory.core.dough.Dough;
import D_PizzaStore_Factory.abstract_factory.core.sauce.Sauce;

public class NYVeggiePizza implements Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;
    Dough dough;
    Clams clams;
    Sauce sauce;
    public NYVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare NYVeggiePizza");
        sauce = this.pizzaIngredientFactory.createSauce();
        clams = this.pizzaIngredientFactory.createClams();
        dough = this.pizzaIngredientFactory.createDough();
    }

    @Override
    public void bake() {
        System.out.println("Baking NYVeggiePizza");
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
