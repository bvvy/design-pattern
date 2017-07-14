package observer.second

/**
 * Created by bvvy on 2017/7/14.
 */
open class CurrentConditionDisplay(weatherData: Subject) : Observer, DisplayElement {

    var temprature: Float = 0f
    var humidity: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("当前温度：" + temprature + "当前湿度" + humidity)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temprature = temp
        this.humidity = humidity
        display()
    }


}