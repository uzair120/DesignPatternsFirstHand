package I2_Restaurant_Composite.core;

import java.util.Iterator;

public class Waitress {
    MenuComponent menus;

    public Waitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = ((Menu) menus).createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print(); }
            } catch (UnsupportedOperationException e) {} }
    }
}
