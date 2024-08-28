package J_GumBalls_State.core;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Illogic state - Out of balls");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Illogic state");
    }

    @Override
    public void turnCrank() {
        System.out.println("Illogic state");
    }

    @Override
    public void dispense() {
        System.out.println("Illogic state");
    }

    @Override
    public void refill(int count) {
        System.out.println("Refilled Successfully. ");
        this.gumballMachine.setCount(count);
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }
}
