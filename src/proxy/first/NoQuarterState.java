package proxy.first;

/**
 * Created by bvvy on 2017/7/23.
 */
public class NoQuarterState implements State{

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you havent insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("you havent insert a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you hvaent insert a quarter");
    }
}
