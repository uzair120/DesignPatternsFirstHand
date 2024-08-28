package J_GumBalls_State.core;

import java.util.Random;

public class HasQuarterState implements State{
    GumballMachine gumballMachine;

    Random randomWinner = new Random(System.currentTimeMillis());
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Coin Already Inserted.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejection Successfully. Receive your coin back.");
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Cranked Successfully. Sold");
        int winner = randomWinner.nextInt();
        if (winner == 0 && this.gumballMachine.getCount() > 0) {
            this.gumballMachine.setState(this.gumballMachine.getWinnerState());
        } else {
            this.gumballMachine.setState(this.gumballMachine.getSoldState());
        }
    }
    @Override
    public void dispense() {
        System.out.println("Illogic state");
    }

    @Override
    public void refill(int count) {
        System.out.println("Illogic State");
    }
}
