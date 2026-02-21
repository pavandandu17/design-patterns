package iterators;

import java.util.List;

import menus.MenuItem;

public class PancakeHouseMenuIterator implements Iterator{
    List<MenuItem> menuItems;
    int nextIterableIdx = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    @Override
    public boolean hasNext() {
        return nextIterableIdx < menuItems.size();
    }

    @Override
    public MenuItem next() {
        return this.menuItems.get(nextIterableIdx++);
    }
    
}
