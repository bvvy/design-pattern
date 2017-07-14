package observer.second

/**
 * Created by bvvy on 2017/7/14.
 */
fun main(args: Array<String>) {
    var weatherData = WeatherData()
    CurrentConditionDisplay(weatherData)
    ForecastDisplay(weatherData)
    StatisticsDisplay(weatherData)
    weatherData.setMeasurements(1f, 1f, 1f)
}
