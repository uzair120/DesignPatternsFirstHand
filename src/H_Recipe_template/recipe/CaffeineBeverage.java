package H_Recipe_template.recipe;

public abstract class CaffeineBeverage {

    public final void prepareBeverage() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        this.addCondiments();
        this.hook();
    }

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring In Cup");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void hook() {

    }
}
