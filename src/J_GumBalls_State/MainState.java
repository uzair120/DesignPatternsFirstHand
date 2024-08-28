package J_GumBalls_State;

import J_GumBalls_State.core.GumballMachine;

public class MainState {
    public static void execute(){
        GumballMachine gumballMachine = new GumballMachine(5);
        //1
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        //2
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        //3
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        //4
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        //5
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        //6
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        //1
        gumballMachine.refill(3);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

    }
}
