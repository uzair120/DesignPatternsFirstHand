package D_PizzaStore_Factory;

import D_PizzaStore_Factory.factory.ChicagoPizzaStore;
import D_PizzaStore_Factory.factory.NYPizzaStore;
import D_PizzaStore_Factory.factory.core.Pizza;

public class MainFactory {
    public static void execute() {
        NYPizzaStore NYPizzaStore = new NYPizzaStore();
        Pizza pizza = NYPizzaStore.orderPizza("cheese");
        Pizza pizza1 = NYPizzaStore.orderPizza("veg");


        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza2 = chicagoPizzaStore.orderPizza("cheese");
        Pizza pizza3 = chicagoPizzaStore.orderPizza("veg");

    }
}
