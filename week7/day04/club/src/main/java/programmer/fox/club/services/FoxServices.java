package programmer.fox.club.services;

import java.util.List;
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

  public List<Fox> getRepoFoxes() {
    return foxrepo.getFoxes();
  }

  public void add(Fox roka) {
    foxrepo.addFoxes(roka);
  }


}