package decoration.second

/**
 * Created by bvvy on 2017/7/16.
 */
open class Decaf: Beverage() {
    init{
        description = "超级好吃的decaf咖啡"

    }
     override fun cost(): Double {
         return 15.0
    }

}