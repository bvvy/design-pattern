package decoration.third;

/**
 * Created by bvvy on 2017/7/19.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;

    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",soy";
    }

    @Override
    public float cost() {
        return beverage.cost() + 2.4f;
    }
}
