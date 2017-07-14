package strategy.complete

/**
 * Created by bvvy on 2017/7/13.
 */
abstract class Duck {
    lateinit var flyBehavior: FlyBehavior
    lateinit var quackBehavior: QuackBehavior

    open fun performFly() {
        flyBehavior.fly()
    }

    open fun performQuack() {
        quackBehavior.quack()

    }

    abstract fun swim()

    abstract fun display()
}
