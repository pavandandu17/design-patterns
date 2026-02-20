import java.util.List;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        for(int i=0; i<breakfastItems.size(); i++) {
            System.out.println(breakfastItems.get(i));
        }
        
        MenuItem[] dinerItems = dinerMenu.getMenuItems();
        for(int i=0; i<dinerItems.length; i++) {
            System.out.println(dinerItems[i]);
        }
    }
}
