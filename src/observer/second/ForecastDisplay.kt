package observer.second

/**
 * Created by bvvy on 2017/7/14.
 */

open class ForecastDisplay(weatherData: Subject) : Observer, DisplayElement {
    init {
        weatherData.registerObserver(this)
    }

    var temprature: Float = 0f
    var pressure: Float = 0f
    var humidity: Float = 0f
    override fun display() {
        println("未来温度是："+temprature +"适度 ："+humidity +"气压："+pressure)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temprature = temp + 1
        this.humidity = humidity - 1
        this.pressure = pressure * 1
        display()
    }
}