package decoration.second

/**
 * Created by bvvy on 2017/7/16.
 */

abstract class Beverage {


    var description = ""
    open fun cost(): Double {
        return 1.1
    }


    fun hasMilk(): Boolean {
        return false

    }

    fun hasSoy(): Boolean {
        return false
    }

    fun hasMocha(): Boolean {
        return false
    }

    fun hasWhip(): Boolean {
        return false

    }
}