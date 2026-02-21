package menus;

import java.util.Iterator;

import iterators.DinerMenuIterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of day", "Soup of the day, with a side of potato salad", false, 3.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if(numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full!");
        } else {
            menuItems[numberOfItems++] = new MenuItem(name, description, vegetarian, price);
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
