package K_Proxy.Gumball.core;

import K_Proxy.Gumball.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;
    private String location;

    private State state;
    private int count = 0;

    public GumballMachine(String location, int numberOfGumballs) throws RemoteException {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        this.count = numberOfGumballs;
        this.location = location;
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void refill(int count) {
        state.refill(count);
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A ball is rolling out for you.");
        if (count > 0) this.count--;
    }
    // Getters and Setters

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return this.location;
    }

    @Override
    public State getState() throws RemoteException {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
