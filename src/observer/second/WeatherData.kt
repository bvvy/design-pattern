package observer.second

/**
 * Created by bvvy on 2017/7/14.
 */
open class WeatherData : Subject {
    var observers: ArrayList<Observer>
    var temperature: Float = 0f
    var humidity: Float = 0f
    var pressure: Float = 0f

    constructor() {
        observers = ArrayList<Observer>()
    }

    override fun registerObserver(observer: Observer) {
        observers.add(observer)

    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach({
            it.update(temperature, humidity, pressure)
        })
    }

    open fun setMeasurements(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp;
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    open fun measurementsChanged() {
        notifyObservers()
    }


}