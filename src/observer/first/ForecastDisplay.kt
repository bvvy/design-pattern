package observer.first

/**
 * Created by bvvy on 2017/7/14.
 */

open class ForecastDisplay {
    open fun update(temp: Float, humidity: Float, pressure: Float) {
        print("未来温度是：")
    }
}