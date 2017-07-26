package proxy.first;

/**
 * Created by bvvy on 2017/7/26.
 */
public class Client {


    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        for(int i=0;i<10;i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine.count);
        }
    }
}
