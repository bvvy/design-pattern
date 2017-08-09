package multi.first;

/**
 * Created by bvvy on 2017/7/26.
 */
public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
