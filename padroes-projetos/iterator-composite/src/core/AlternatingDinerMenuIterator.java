package core;

import java.util.Calendar;
import java.util.Iterator;

import core.MenuItem;

public class AlternatingDinerMenuIterator implements Iterator {
  java.awt.MenuItem[] items;
  int position;

  public AlternatingDinerMenuIterator(MenuItem[] items) {
    this.items = items;
    Calendar rigthNow = Calendar.getInstance();
    position = rigthNow.DAY_OF_WEEK % 2;
  }

  @Override
  public boolean hasNext() {
    if (position >= items.length || items[position] == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public Object next() {
    MenuItem menuItem = items[position];
    position = position + 2;
    return menuItem;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
  }
}