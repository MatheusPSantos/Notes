package core;

public class MenuItem {
  String name;
  String description;
  boolean vegeration;
  double price;

  public MenuItem(String name, String description, boolean vegeration, double price) {
    this.name = name;
    this.description = description;
    this.vegeration = vegeration;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isVegeration() {
    return vegeration;
  }

  public void setVegeration(boolean vegeration) {
    this.vegeration = vegeration;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "MenuItem [name=" + name + ", description=" + description + ", vegeration=" + vegeration + ", price=" + price
        + "]";
  }

  

}
