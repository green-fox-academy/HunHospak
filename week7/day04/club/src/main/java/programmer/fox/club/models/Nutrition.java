package programmer.fox.club.models;

import java.util.List;

public class Nutrition {
  private List<String> foods;
  private List<String> drinks;

  public List<String> addFood() {
    foods.add("hamburger");
    foods.add("fries");
    foods.add("fish");
    foods.add("chips");
    return foods;
  }

  public List<String> addDrinks() {
    drinks.add("cola");
    drinks.add("sprite");
    drinks.add("jucice");
    drinks.add("water");
    return drinks;
  }
}
