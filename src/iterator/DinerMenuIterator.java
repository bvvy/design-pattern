package iterator;

/**
 * Created by bvvy on 2017/7/21.
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem []menuItem;
    int pos = 0;

    public DinerMenuIterator(MenuItem[] menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public MenuItem next() {
        return menuItem[pos++];
    }

    @Override
    public boolean hasNext() {
        return !(pos >= menuItem.length || menuItem[pos] == null);
    }
}
