package H_Recipe_template;

import H_Recipe_template.recipe.Coffee;
import H_Recipe_template.recipe.Tea;

public class MainRecipe {

    public static void execute() {

        Tea tea = new Tea();
        tea.prepareBeverage();

        Coffee coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
