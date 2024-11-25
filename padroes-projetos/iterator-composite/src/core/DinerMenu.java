package core;

import iterator.Iterator;

public class DinerMenu {
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;

  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce &tomato on whole wheat", true, 2.99);
    addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
    addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
  }

  public void addItem(String name, String description, boolean vegeratian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegeratian, price);
    if (numberOfItems >= MAX_ITEMS) {
      System.err.println("Sorry, menu is full! Can't add item to menu");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems = numberOfItems + 1;
    }
  }

  public static int getMaxItems() {
    return MAX_ITEMS;
  }

  public int getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(int numberOfItems) {
    this.numberOfItems = numberOfItems;
  }

  @Deprecated
  public MenuItem[] getMenuItems() {
    return menuItems;
  }

  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }

  public java.util.Iterator createIteratorDoJavaUtil() {
    return menuItems.
  }

  public void setMenuItems(MenuItem[] menuItems) {
    this.menuItems = menuItems;
  }

  
}

