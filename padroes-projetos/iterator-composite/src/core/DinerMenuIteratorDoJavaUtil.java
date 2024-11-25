package core;

public class DinerMenuIteratorDoJavaUtil implements java.util.Iterator {

  MenuItem[] items;
  private int position = 0;

  public DinerMenuIteratorDoJavaUtil(MenuItem[] items) {
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

  @Override
  public void remove() {
    if (position < 0) {
      throw new IllegalStateException("You can not remove an item until you have done at least one next()");
    }
    if (items[position - 1] != null) {
      for (int i = position - 1; i < (items.length - 1); i++) {
        items[i] = items[i + 1];
      }
      items[items.length - 1] = null;
    }
  }

}
