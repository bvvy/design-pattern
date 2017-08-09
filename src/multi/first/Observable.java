package multi.first;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bvvy on 2017/7/26.
 */
public class Observable implements QuackObservable {

    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(duck);
        }
    }
}
