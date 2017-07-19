package decoration.second

/**
 * Created by bvvy on 2017/7/16.
 */

abstract class Beverage {
    var description:String
        get() {return description}
        set(_description) { description = _description}
    constructor(){}
    constructor(description:String) {
        this.description = description
    }
    private var hasMilk: Boolean = false
    private var hasSoy  = false
    private var hasMocha = false
    private var hasWhip = false

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