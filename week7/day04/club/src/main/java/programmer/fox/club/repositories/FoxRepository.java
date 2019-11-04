package programmer.fox.club.repositories;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import programmer.fox.club.models.Fox;

@Repository
public class FoxRepository {
  private List<Fox> foxes = new ArrayList<>();

  public FoxRepository() {
    foxes.add(new Fox("Roka"));
    foxes.add(new Fox("Feri"));
    foxes.add(new Fox("Tamas"));
  }



  public List<Fox> getFoxes() {
    return foxes;
  }

  public void addFoxes(Fox fox) {
    foxes.add(fox);
  }
}
