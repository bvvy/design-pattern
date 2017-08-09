package multi.first;

import strategy.complete.Quack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by bvvy on 2017/7/26.
 */
public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<>();
    Observable observable;

    public Flock() {
        this.observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
            notifyObservers();
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quackable : quackers) {
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Quackable quackable : quackers) {
            quackable.notifyObservers();
        }
    }
}
