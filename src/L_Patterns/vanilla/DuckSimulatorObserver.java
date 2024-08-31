package L_Patterns.vanilla;

import L_Patterns.vanilla.factory.AbstractDuckFactory;
import L_Patterns.vanilla.factory.CountingDuckFactory;
import L_Patterns.vanilla.factory.Flock;
import L_Patterns.vanilla.observer.Quackologist;
import L_Patterns.vanilla.strategy.Goose;
import L_Patterns.vanilla.strategy.GooseAdapter;
import L_Patterns.vanilla.strategy.QuackCounter;
import L_Patterns.vanilla.strategy.Quackable;

public class DuckSimulatorObserver {
    public static void execute() {
        DuckSimulatorObserver simulator = new DuckSimulatorObserver();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Observer - Flocks");
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() +
                " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
