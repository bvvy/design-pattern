package proxy.first;

/**
 * Created by bvvy on 2017/7/23.
 */
public class SoldOutState implements State{

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("sold out");
    }

    @Override
    public void dispense() {
        System.out.println("sold out");

    }
}
