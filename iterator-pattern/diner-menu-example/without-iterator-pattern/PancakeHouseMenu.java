import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("KB Pancake Breakfast", "Pancakes with scrambled eggs and toast", false, 2.99));
        menuItems.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs and toast", false, 2.99));
        menuItems.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }
}