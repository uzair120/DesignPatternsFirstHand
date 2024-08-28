package J_GumBalls_State.core;

public class NoQuarterState implements State{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Insert Successfully. Move to next Step. ");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You need to insert the coin first");
    }

    @Override
    public void turnCrank() {
        System.out.println("Illogic state");
    }

    @Override
    public void dispense() {
        System.out.println("Illogic State");
    }

    @Override
    public void refill(int count) {
        System.out.println("Illogic State");
    }
}
