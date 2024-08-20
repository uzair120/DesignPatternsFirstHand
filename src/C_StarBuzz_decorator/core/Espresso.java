package C_StarBuzz_decorator.core;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public float cost() {
        return 7;
    }
}
