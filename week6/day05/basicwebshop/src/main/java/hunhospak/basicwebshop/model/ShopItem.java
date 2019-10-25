package hunhospak.basicwebshop.model;

public class ShopItem {
  String name;
  String description;
  double price;
  int quantityStock;

  public ShopItem(String name, String description, double price, int quantityStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityStock = quantityStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantityStock() {
    return quantityStock;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantityStock(int quantityStock) {
    this.quantityStock = quantityStock;
  }
}
