package proxy.first;

/**
 * Created by bvvy on 2017/7/26.
 */
public class GumballMonitor {

    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball machine " + gumballMachine.getLocation());
        System.out.println("current inventory " + gumballMachine.count + "gumballs");
        System.out.println("Current state" + gumballMachine.state);
    }
}
