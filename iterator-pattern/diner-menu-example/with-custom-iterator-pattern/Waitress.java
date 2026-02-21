import iterators.Iterator;
import menus.Menu;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakIterator = pancakeHouseMenu.getIterator();
        while(pancakIterator.hasNext()) {
            System.out.println(pancakIterator.next());
        }
        
        Iterator dinerIterator = dinerMenu.getIterator();
        while(dinerIterator.hasNext()) {
            System.out.println(dinerIterator.next());
        }
    }
}
