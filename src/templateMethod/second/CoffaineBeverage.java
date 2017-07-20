package templateMethod.second;

/**
 * Created by bvvy on 2017/7/20.
 */
public abstract class CoffaineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourCup();
        addCondiment();
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void pourCup() {
        System.out.println("pour into cup");
    }

    public abstract void brew();

    public abstract void addCondiment();

}
