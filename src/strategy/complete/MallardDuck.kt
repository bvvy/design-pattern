package strategy.complete

/**
 * Created by bvvy on 2017/7/13.
 */
open class MallardDuck : Duck {
    constructor() {
        quackBehavior = Squeak()
        flyBehavior = FlyWithWings()
    }

    override fun swim() {
        print("i can swim")
    }

    override fun display() {
        print("i have green head")
    }
}