package C_StarBuzz_decorator.core;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.77f;
    }
}
