package adapter;

/**
 * Created by bvvy on 2017/7/20.
 */
public class Client {


    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.fly();
        duck.quack();
    }
}
