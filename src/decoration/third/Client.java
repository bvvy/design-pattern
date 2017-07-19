package decoration.third;

import com.sun.jndi.ldap.Ber;

/**
 * Created by bvvy on 2017/7/19.
 */
public class Client {



    public static void main(String[] args) {
       Beverage beverage = new Mocha(new Soy(new Mocha(new DarkRoast())));
        System.out.println(beverage.cost());
    }
}
