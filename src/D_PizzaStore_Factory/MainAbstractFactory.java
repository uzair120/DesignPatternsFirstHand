package D_PizzaStore_Factory;

import D_PizzaStore_Factory.abstract_factory.ChicagoPizzaStore;
import D_PizzaStore_Factory.abstract_factory.NYPizzaStore;
import D_PizzaStore_Factory.abstract_factory.core.Pizza;

public class MainAbstractFactory {
    public static void execute() {
        NYPizzaStore NYPizzaStore = new NYPizzaStore();
        Pizza pizza = NYPizzaStore.orderPizza("cheese");
        Pizza pizza1 = NYPizzaStore.orderPizza("veg");

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza2 = chicagoPizzaStore.orderPizza("cheese");
        Pizza pizza3 = chicagoPizzaStore.orderPizza("veg");

    }
}
