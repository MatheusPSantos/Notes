import core.DinerMenu;
import core.PancakeHouseMenu;
import core.Waitress;
import iterator.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());

        waitress.printMenu();
    }
}
