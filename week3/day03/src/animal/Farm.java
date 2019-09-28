package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> farm = new ArrayList<>();
    int slot = 10;

    public void Breed() {
        for (int i = 0; i < this.farm.size(); i++) {
            if (farm.get(i) == null) {
                farm.add(new Animal());
            }
        }
    }

    public void Slaughter() {
        int leastHungry = farm.get(0).hunger;
        for (int i = 0; i < this.farm.size() - 1; i++) {
            if (farm.get(i).hunger > farm.get(i + 1).hunger) {
                leastHungry = i + 1;
            }
        }
        farm.remove(leastHungry);
    }
}
