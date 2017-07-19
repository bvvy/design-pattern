package decoration.third;

/**
 * Created by bvvy on 2017/7/19.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "delicious dark roast coffee";
    }
    @Override
    public float cost() {
        return 24.2f;
    }
}
