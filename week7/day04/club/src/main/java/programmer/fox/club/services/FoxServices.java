package programmer.fox.club.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import programmer.fox.club.models.Fox;
import programmer.fox.club.repositories.FoxRepository;

@Service
public class FoxServices {
  private FoxRepository foxrepo;

  @Autowired
  public FoxServices(FoxRepository foxrepo) {
    this.foxrepo = foxrepo;
  }

  public boolean hasName(String name) {
    return foxrepo.getFoxes().stream().anyMatch(fox -> fox.getPetName().equals(name));
  }

  public String getServFood(String name) {
    return foxrepo.getFoxes().stream().filter(fox -> fox.getPetName().equals(name)).collect(Collectors.toList()).get(0).getFood();
  }

  public String getServDrink(String name) {
    return foxrepo.getFoxes().stream().filter(fox -> fox.getPetName().equals(name)).collect(Collectors.toList()).get(0).getDrink();
  }

  public List<String> getFoodList() {
    return foxrepo.
  }


  public List<Fox> getRepoFoxes() {
    return foxrepo.getFoxes();
  }

  public void add(Fox roka) {
    foxrepo.addFoxes(roka);
  }

}