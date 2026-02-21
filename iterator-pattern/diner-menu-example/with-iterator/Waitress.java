import java.util.Iterator;

import menus.Menu;
import menus.MenuItem;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakIterator = pancakeHouseMenu.getIterator();
        while(pancakIterator.hasNext()) {
            System.out.println(pancakIterator.next());
        }
        
        Iterator<MenuItem> dinerIterator = dinerMenu.getIterator();
        while(dinerIterator.hasNext()) {
            System.out.println(dinerIterator.next());
        }
    }
}
