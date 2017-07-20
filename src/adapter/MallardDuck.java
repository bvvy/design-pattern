package adapter;

/**
 * Created by bvvy on 2017/7/20.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    @Override
    public void fly() {
        System.out.println("i m flying");
    }
}
