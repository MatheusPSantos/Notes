package core;

import iterator.Iterator;

public class Waitress {
  DinerMenu dinerMenu;
  PancakeHouseMenu pancakeHouseMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
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
