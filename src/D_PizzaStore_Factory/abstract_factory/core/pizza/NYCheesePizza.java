package D_PizzaStore_Factory.abstract_factory.core.pizza;

import D_PizzaStore_Factory.abstract_factory.core.Pizza;
import D_PizzaStore_Factory.abstract_factory.core.PizzaIngredientFactory;
import D_PizzaStore_Factory.abstract_factory.core.cheese.Cheese;
import D_PizzaStore_Factory.abstract_factory.core.dough.Dough;
import D_PizzaStore_Factory.abstract_factory.core.sauce.Sauce;

public class NYCheesePizza implements Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;
    Dough dough;
    Cheese cheese;
    Sauce sauce;
    public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare NYCheesePizza");
        sauce = this.pizzaIngredientFactory.createSauce();
        cheese = this.pizzaIngredientFactory.createCheese();
        dough = this.pizzaIngredientFactory.createDough();
    }

    @Override
    public void bake() {
        System.out.println("Baking NYCheesePizza");
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
