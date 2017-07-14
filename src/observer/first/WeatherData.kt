package observer.first

/**
 * Created by bvvy on 2017/7/14.
 */
open class WeatherData {

    var currentCondition = observer.first.CurrentConditionDisplay()
    var forcastDisplay = ForecastDisplay()
    var sd = observer.first.StatisticsDisplay()
    open fun getTemperature():Float{
        return  20.0f
    }

    open fun getHumidity(): Float {
        return 31.3f
    }

    open fun getPressure(): Float {
        return 1.01f
    }

    open fun meansurementsChanged() {
        var temp = getTemperature()
        var humidity = getHumidity()
        var pressure = getPressure()
        currentCondition.update(temp,humidity,pressure)
        forcastDisplay.update(temp,humidity,pressure)
        sd.update(temp,humidity,pressure)
    }
}