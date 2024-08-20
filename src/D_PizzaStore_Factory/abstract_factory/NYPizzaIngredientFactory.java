package D_PizzaStore_Factory.abstract_factory;

import D_PizzaStore_Factory.abstract_factory.core.PizzaIngredientFactory;
import D_PizzaStore_Factory.abstract_factory.core.cheese.Cheese;
import D_PizzaStore_Factory.abstract_factory.core.cheese.MozzarellaCheese;
import D_PizzaStore_Factory.abstract_factory.core.clams.Clams;
import D_PizzaStore_Factory.abstract_factory.core.clams.FrozenClams;
import D_PizzaStore_Factory.abstract_factory.core.dough.Dough;
import D_PizzaStore_Factory.abstract_factory.core.dough.ThickCrustDough;
import D_PizzaStore_Factory.abstract_factory.core.sauce.PlumTomatoSauce;
import D_PizzaStore_Factory.abstract_factory.core.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
