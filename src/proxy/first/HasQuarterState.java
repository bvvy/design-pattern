package proxy.first;

import java.util.Random;

/**
 * Created by bvvy on 2017/7/23.
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("you cant insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter return ");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned...");
        int winner = randomWinner(10);
        if (winner == 0 && gumballMachine.count > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("NO gumball dispensed");

    }

    private int randomWinner(int ran) {
        return new Random().nextInt(ran);
    }
}
