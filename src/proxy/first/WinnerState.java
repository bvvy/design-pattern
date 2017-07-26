package proxy.first;

/**
 * Created by bvvy on 2017/7/23.
 */
public class WinnerState implements State{

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("fail");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("fail");
    }

    @Override
    public void turnCrank() {
        System.out.println("fail");
    }

    @Override
    public void dispense() {
        System.out.println("you are the winner");
        gumballMachine.releaseBall();
        if (gumballMachine.count > 1) {
            gumballMachine.releaseBall();
            if (gumballMachine.count > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
