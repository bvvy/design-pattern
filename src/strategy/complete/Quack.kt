package strategy.complete

/**
 * Created by bvvy on 2017/7/13.
 */
open class Quack : QuackBehavior {
    override fun quack() {
        print("gaga")
    }
}