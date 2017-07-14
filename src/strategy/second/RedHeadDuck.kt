package strategy.second

/**
 * Created by bvvy on 2017/7/13.
 */
open class RedHeadDuck : Duck,Flyable,Quackable {
    override fun fly() {
        print("i am fly ")
    }

    override fun quack() {
        print("gaga")
    }


    override fun swim() {
        print("i m swim")
    }

    override fun display() {
       print("I have a red head")
    }

}