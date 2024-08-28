package J_GumBalls_State.core;

public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    private State state;
    private int count = 0;

    public GumballMachine(int numberOfGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        this.count = numberOfGumballs;
        if (count > 0){
            state = noQuarterState;
        }
        else{
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void refill(int count){
        state.refill(count);
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    public void releaseBall(){
        System.out.println("A ball is rolling out for you.");
        if(count > 0) this.count--;
    }
    // Getters and Setters

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setState(State state){
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
