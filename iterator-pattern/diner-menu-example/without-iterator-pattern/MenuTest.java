public class MenuTest {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());

        waitress.printMenu();
    }
}
