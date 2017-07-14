package observer.first

/**
 * Created by bvvy on 2017/7/14.
 */
open class StatisticsDisplay {
    open fun update(temp: Float, humidity: Float, pressure: Float) {
        print("统计布告板")
    }
}