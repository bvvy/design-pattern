package multi.first;

import strategy.complete.Quack;

/**
 * Created by bvvy on 2017/7/26.
 */
public class DucSimulator {

    void simulate( AbstractDuckFactory duckFactory) {

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable readheadDuck = duckFactory.createReadHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseQuack = new GooseAdapter(new Goose());
        System.out.println(" duck simulator with Composite - Flocks");

        Flock flockDuck = new Flock();
        flockDuck.add(readheadDuck);
        flockDuck.add(duckCall);
        flockDuck.add(rubberDuck);
        flockDuck.add(gooseQuack);

        Flock flockOfMallards = new Flock();
        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardDuck1);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(mallardDuck3);
        flockOfMallards.add(mallardDuck4);

        flockDuck.add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        mallardDuck.registerObserver(quackologist);
        simulate(mallardDuck);

        /*simulate(mallardDuck);
        simulate(readheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseQuack);*/
        System.out.println("All ducks simulator:");

        simulate(flockDuck);
        System.out.println("Mallard duck simulator:");
        simulate(flockOfMallards);

        System.out.println("the ducks quacked "+QuackCounter.getNumberOfQuacks()+" times");



    }

    void simulate(Quackable duck) {
        duck.quack();
    }

    public static void main(String[] args) {
        DucSimulator simulator = new DucSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
}
