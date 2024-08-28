package I1_Restaurant_Iterator;

import I1_Restaurant_Iterator.core.DinerMenu;
import I1_Restaurant_Iterator.core.PanCakeHouseMenu;
import I1_Restaurant_Iterator.core.Waitress;

public class MainRestaurantIterator {
    public static void execute(){
        PanCakeHouseMenu pancakeHouseMenu = new PanCakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
