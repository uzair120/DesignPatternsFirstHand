package H_Recipe_template.recipe;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and milk in the Coffee");
    }

    @Override
    public void hook() {
        System.out.println("This is hook method. Just for any additional steps (if needed)");
    }
}
