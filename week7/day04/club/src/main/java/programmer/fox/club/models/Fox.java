package programmer.fox.club.models;

import org.springframework.stereotype.Service;

@Service
public class Fox {
  private String petName;
  private String food;
  private String drink;

  public Fox() {
  }

  public Fox(String petName) {
    this.petName = petName;
  }

  public Fox(String petNames, String food, String drink) {
    this.petName = petNames;
    this.food = food;
    this.drink = drink;
  }


  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
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
