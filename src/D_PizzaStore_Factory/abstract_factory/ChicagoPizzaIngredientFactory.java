package D_PizzaStore_Factory.abstract_factory;

import D_PizzaStore_Factory.abstract_factory.core.PizzaIngredientFactory;
import D_PizzaStore_Factory.abstract_factory.core.cheese.Cheese;
import D_PizzaStore_Factory.abstract_factory.core.cheese.ReggianoCheese;
import D_PizzaStore_Factory.abstract_factory.core.clams.Clams;
import D_PizzaStore_Factory.abstract_factory.core.clams.FreshClams;
import D_PizzaStore_Factory.abstract_factory.core.dough.Dough;
import D_PizzaStore_Factory.abstract_factory.core.dough.ThinCrustDough;
import D_PizzaStore_Factory.abstract_factory.core.sauce.MarinaraSauce;
import D_PizzaStore_Factory.abstract_factory.core.sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
