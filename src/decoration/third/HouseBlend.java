package decoration.third;

import com.sun.jndi.ldap.Ber;

/**
 * Created by bvvy on 2017/7/19.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "好吃的houseblend coffee";
    }

    @Override
    public float cost() {
        return 12.5f;
    }
}
