package C_StarBuzz_decorator;

import C_StarBuzz_decorator.core.*;

public class MainStarBuzz {

    public static void execute() {

        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        System.out.println(espresso.getDescription() + ", $ " + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + ", $ " + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + ", $ " + houseBlend.cost());
    }

}
