package A_Duck_Strategy;

import A_Duck_Strategy.core.FlayWithWings;
import A_Duck_Strategy.core.FlyNoWay;
import A_Duck_Strategy.core.Quack;
import A_Duck_Strategy.core.Squeak;

public class DuckMain {

    public static void execute() {

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.canSwim();
        rubberDuck.display();

        FlayWithWings flayWithWings = new FlayWithWings();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.setFlyBehavior(flayWithWings);
        redHeadDuck.performFly();
        redHeadDuck.display();

        Squeak squeak = new Squeak();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.setQuackBehavior(squeak);
        decoyDuck.canSwim();
        decoyDuck.display();
        decoyDuck.performQuack();

        FlyNoWay flyNoWay = new FlyNoWay();
        Quack quack = new Quack();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(flyNoWay);
        mallardDuck.setQuackBehavior(quack);
        mallardDuck.canSwim();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }

}
