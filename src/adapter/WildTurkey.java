package adapter;

/**
 * Created by bvvy on 2017/7/20.
 */
public class WildTurkey implements Turkey {
    @Override
    public void fly() {
        System.out.println("i am fly ing ");
    }

    @Override
    public void gobble() {
        System.out.println("咕咕咕咕");
    }
}
