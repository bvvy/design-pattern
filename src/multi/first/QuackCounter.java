package multi.first;


/**
 * Created by bvvy on 2017/7/26.
 */
public class QuackCounter implements Quackable {
    Observable observable;

    public QuackCounter() {
        this.observable = new Observable(this);
    }
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
