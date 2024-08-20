package D_PizzaStore_Factory.abstract_factory.core.pizza;

import D_PizzaStore_Factory.abstract_factory.core.Pizza;
import D_PizzaStore_Factory.abstract_factory.core.PizzaIngredientFactory;
import D_PizzaStore_Factory.abstract_factory.core.cheese.Cheese;
import D_PizzaStore_Factory.abstract_factory.core.dough.Dough;
import D_PizzaStore_Factory.abstract_factory.core.sauce.Sauce;


public class ChicagoCheesePizza implements Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    Dough dough;
    Cheese cheese;
    Sauce sauce;
    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing ChicagoCheesePizza");

        cheese = this.pizzaIngredientFactory.createCheese();
        sauce = this.pizzaIngredientFactory.createSauce();
        dough = this.pizzaIngredientFactory.createDough();

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
