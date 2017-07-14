package observer.second

/**
 * Created by bvvy on 2017/7/14.
 */
interface Subject {
    fun registerObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers()

}