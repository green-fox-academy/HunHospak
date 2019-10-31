package programmer.fox.club.models;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Fox {
  private String petName;
  private List<String> tricks;
  private String food = "pizza";
  private String drink = "lemonade";

  public Fox() {
  }

  public Fox(String petNames, List<String> tricks, String food, String drink) {
    this.petName = petNames;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
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
