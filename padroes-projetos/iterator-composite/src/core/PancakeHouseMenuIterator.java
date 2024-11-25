package core;

import java.util.ArrayList;

import iterator.Iterator;

public class PancakeHouseMenuIterator implements Iterator {

  public ArrayList<MenuItem> menuItems;
  private int position = 0;

  public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    return !(position >= menuItems.size() || menuItems.get(position) == null);
  }

  @Override
  public Object next() {
    MenuItem menuItem = menuItems.get(position);
    position = position + 1;
    return menuItem;
  }
}
