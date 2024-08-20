package C_StarBuzz_decorator.core;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public float cost() {
        return 5;
    }
}
