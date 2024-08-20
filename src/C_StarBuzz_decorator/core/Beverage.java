package C_StarBuzz_decorator.core;

public abstract class Beverage {
    String description = "No beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract float cost();

}
