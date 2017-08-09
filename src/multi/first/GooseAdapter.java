package multi.first;

/**
 * Created by bvvy on 2017/7/26.
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public GooseAdapter() {
        observable = new Observable(this);
    }

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.hook();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
