package templateMethod.first;

/**
 * Created by bvvy on 2017/7/20.
 */
public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void addLemon() {
        System.out.println("adding lemon");
    }

    private void pourInCup() {
        System.out.println("pour in cup");
    }

    private void steepTeaBag() {
        System.out.println("steeping the tea");
    }

    private void boilWater() {
        System.out.println("Boiling water");

    }
}
