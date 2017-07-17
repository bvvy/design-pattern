package decoration.second

/**
 * Created by bvvy on 2017/7/16.
 */
class HouseBlend : Beverage() {
    init {
        description = "超级好吃的houseBlend咖啡"
    }

    override fun cost():Double {
        return 25.0
    }

}