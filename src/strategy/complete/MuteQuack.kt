package strategy.complete

/**
 * Created by bvvy on 2017/7/13.
 */
open class MuteQuack : QuackBehavior {
    override fun quack() {
        print("i can not speak")
    }
}