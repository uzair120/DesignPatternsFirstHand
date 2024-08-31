package K_Proxy.Gumball.core;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Illogic state");
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
        System.out.println("Dispensed Successfully. ");
        this.gumballMachine.releaseBall();
        if (this.gumballMachine.getCount() > 0) {
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        } else {
            this.gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill(int count) {
        System.out.println("Illogic state");
    }
}
