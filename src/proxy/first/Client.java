package proxy.first;

/**
 * Created by bvvy on 2017/7/26.
 */
public class Client {


    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10, "Seattle");
        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();
    }
}
