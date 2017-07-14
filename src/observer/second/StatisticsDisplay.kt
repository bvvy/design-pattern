package observer.second

/**
 * Created by bvvy on 2017/7/14.
 */
open class StatisticsDisplay(weatherData: Subject) : Observer, DisplayElement {
    private var temprature: Float = 0f
    private var pressure: Float = 0f
    private var humidity: Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temprature = temp +10
        this.humidity = humidity+1
        this.pressure = pressure+10
        display()
    }

    override fun display() {
        println("统计情况是："+temprature +"适度 ："+humidity +"气压："+pressure)
    }

}