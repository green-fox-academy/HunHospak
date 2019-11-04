package programmer.fox.club.models;

import org.springframework.stereotype.Service;

@Service
public class Fox {
  private String petName;
  private String food;
  private String drink;

  public Fox() {
  }

  public Fox(String petNames) {
    this.petName = petNames;
    this.food = "pizza";
    this.drink = "cola";
  }


  public String getFood() {
    this.food="pizza";
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    this.drink="cola";
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String getPetName() {
    return petName;
  }

  public void setPetName(String petName) {
    this.petName = petName;
  }
}
