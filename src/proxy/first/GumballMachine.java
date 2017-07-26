package proxy.first;

/**
 * Created by bvvy on 2017/7/23.
 */
public class GumballMachine {

    State hasQuarterState;
    State noQuarterState;
    State soldOutState;
    State soldState;
    State winnerState;
    String location;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int count,String location) {
        this.location = location;
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("a gumball comes rolling out the slot");
        if(count!=0) count--;
    }

    public String getLocation() {
        return location;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
