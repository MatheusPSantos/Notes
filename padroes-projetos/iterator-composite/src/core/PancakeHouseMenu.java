package core;

import java.util.ArrayList;

import iterator.Iterator;

public class PancakeHouseMenu {
  ArrayList<MenuItem> menuItems;

  public PancakeHouseMenu() {
    menuItems = new ArrayList<>();

    addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("Regular Pancake Breakfast", "Pancakeswith fried eggs, sausage", false, 2.99);
    addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
    addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
  }

  public void addItem(String name, String description, boolean vegeratian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegeratian, price);
    menuItems.add(menuItem);
  }

  @Deprecated
  public ArrayList<MenuItem> getMenuItems() {
    return menuItems;
  }

  public Iterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }

  public java.util.Iterator createIteratorDoJavaUtil() {
    return menuItems.iterator();
  }

  public void setMenuItems(ArrayList<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }
}
