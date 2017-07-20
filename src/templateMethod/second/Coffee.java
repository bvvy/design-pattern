package templateMethod.second;

/**
 * Created by bvvy on 2017/7/20.
 */
public class Coffee extends CoffaineBeverage {


    public void brew() {
        System.out.println("brew coffee");
    }

    @Override
    public void addCondiment() {
        System.out.println("Dripping coffee through filter");
    }

}
