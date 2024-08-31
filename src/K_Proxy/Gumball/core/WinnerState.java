package K_Proxy.Gumball.core;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("Congratulations. you got another ball");
        if (this.gumballMachine.getCount() == 0) {
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
            System.out.println("Sorry, out of balls. ");
        } else {
            this.gumballMachine.releaseBall();
            if (this.gumballMachine.getCount() == 0) {
                this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
                System.out.println("Oops, out of balls");
            } else {
                this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
            }
        }

    }

    @Override
    public void refill(int count) {
        System.out.println("Illogic state");
    }
}
