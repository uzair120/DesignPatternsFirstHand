package I1_Restaurant_Iterator.core;

import java.util.ArrayList;

public class PanCakeHouseMenu implements Menu{

    ArrayList<MenuItem> menuItems;

    public PanCakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast", true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage", false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries", true,
                3.49);

        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);

    }

    public void addItem(String name, String description, Boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        MenuItem []MenuIte = new MenuItem[menuItems.size()];
        menuItems.toArray(MenuIte);
        return new PanCakeIterator(MenuIte);
    }

}
