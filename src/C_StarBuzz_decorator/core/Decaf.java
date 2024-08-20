package C_StarBuzz_decorator.core;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public float cost() {
        return 4;
    }
}
