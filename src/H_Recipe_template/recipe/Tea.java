package H_Recipe_template.recipe;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brewing Tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Lemon in the Tea");
    }
}
