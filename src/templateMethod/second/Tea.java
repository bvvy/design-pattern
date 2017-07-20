package templateMethod.second;

/**
 * Created by bvvy on 2017/7/20.
 */
public class Tea extends CoffaineBeverage {


    @Override
    public void brew() {
        System.out.println("brew tea");
    }

    @Override
    public void addCondiment() {
        System.out.println("add lemon");
    }

    @Override
    boolean customerWantsCondiments() {
        return true;
    }
}
