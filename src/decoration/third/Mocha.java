package decoration.third;

/**
 * Created by bvvy on 2017/7/19.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public float cost() {
        return beverage.cost() + 1.2f;
    }
}
