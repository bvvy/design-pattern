package proxy.first;

/**
 * Created by bvvy on 2017/7/23.
 */
public class SoldState  implements State{

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait  we're already giveing you a gumble");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry you already turn the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turn crank twice can not give you two gumble");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("oops out of gumbles");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }
}
