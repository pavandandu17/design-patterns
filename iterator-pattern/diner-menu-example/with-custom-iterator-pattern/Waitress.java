import iterators.Iterator;
import menus.DinerMenu;
import menus.PancakeHouseMenu;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
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
