package D_PizzaStore_Factory.abstract_factory.core;

import D_PizzaStore_Factory.abstract_factory.core.cheese.Cheese;
import D_PizzaStore_Factory.abstract_factory.core.clams.Clams;
import D_PizzaStore_Factory.abstract_factory.core.dough.Dough;
import D_PizzaStore_Factory.abstract_factory.core.sauce.Sauce;

public interface PizzaIngredientFactory {
    Sauce createSauce();

    Clams createClams();

    Dough createDough();

    Cheese createCheese();
}
