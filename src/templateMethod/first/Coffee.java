package templateMethod.first;

/**
 * Created by bvvy on 2017/7/20.
 */
public class Coffee {

    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        purInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("adding sugar adn milk");
    }

    private void purInCup() {
        System.out.println("puring into cup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter");
    }

    private void boilWater() {
        System.out.println("boilling water1");
    }
}
