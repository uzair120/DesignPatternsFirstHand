package G_Adapter_Facade.duck;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Turkey Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Turkey Fly");
    }
}
