package decoration.first

import com.sun.jndi.ldap.Ber

/**
 * Created by bvvy on 2017/7/16.
 */
open class Decaf: Beverage() {
    override fun cost(): Double {
        return 0.0
    }

}