package core;

import java.util.Iterator;

import iterator.Menu;

public class WaitressComIteratorDoJavaUtil {
  Menu dinerMenu;
  Menu pancakeHouseMenu;

  public WaitressComIteratorDoJavaUtil(
      Menu pancakeHouseMenu, Menu dinerMenu) {
    this.dinerMenu = dinerMenu;
    this.pancakeHouseMenu = pancakeHouseMenu;
  }

  public void printMenu() {
    Iterator dinerIterator = dinerMenu.createIterator();
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    System.out.println("**************\tMENU\t******************");
    System.out.println("\t\tBREAKFAST");
    printMenu(pancakeIterator);
    System.out.println("\t\tLUNCH");
    printMenu(dinerIterator);
  }

  private void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(
          "------------------------------------------------\n"
              + menuItem.getName() + "\n\t|> " + menuItem.getDescription()
              + "\n" + "(R$ " + menuItem.getPrice() + ")\n"
              + "------------------------------------------------");
    }
  }

}
