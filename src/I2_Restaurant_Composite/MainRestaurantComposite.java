package I2_Restaurant_Composite;

import I2_Restaurant_Composite.core.Menu;
import I2_Restaurant_Composite.core.MenuComponent;
import I2_Restaurant_Composite.core.MenuItem;
import I2_Restaurant_Composite.core.Waitress;

public class MainRestaurantComposite {
    public static void execute() {

        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(new MenuItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream", true,
                1.59));
        cafeMenu.add(dessertMenu);
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
