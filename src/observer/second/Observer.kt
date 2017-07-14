package observer.second

/**
 * Created by bvvy on 2017/7/14.
 */
interface Observer {

    fun update(temp: Float, humidity: Float, pressure: Float)

}