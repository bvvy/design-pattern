package strategy.fail_design

/**
 * Created by bvvy on 2017/7/13.
 */
open class RedHeadDuck : Duck() {

    override fun quack() {

        super.quack()
    }

    override fun swim() {
        super.swim()
    }

    override fun display() {
       print("I have a red head")
    }

    override fun fly() {
        super.fly()
    }
}