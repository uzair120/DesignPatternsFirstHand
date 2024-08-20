package C_StarBuzz_decorator.core;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public float cost() {
        return 6;
    }
}
