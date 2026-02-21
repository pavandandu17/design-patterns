package iterators;

import menus.MenuItem;

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int nextIterableIdx = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return nextIterableIdx < menuItems.length;
    }

    @Override
    public MenuItem next() {
        return this.menuItems[nextIterableIdx++];
    }


}
