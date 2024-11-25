package core;

import iterator.Iterator;

public class DinerMenuIterator implements Iterator {
  MenuItem[] items;
  private int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    return !(position >= items.length || items[position] == null);
  }

  @Override
  public Object next() {
    MenuItem menuItem = items[position];
    position = position + 1;
    return menuItem;
  }

}
