package pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> fleet = new ArrayList<>();

    public void Shipbuilder () {
        for (int i = 0; i < 8; i++) {
            fleet.add(new Ship());
            this.fleet.get(i).fillShip();
        }
    }

    public boolean War (Armada second) {
        int p = 0;
        int k = 0;
        int i = 0;
        int j = 0;
        while (this.fleet.size()>i && second.fleet.size()>j) {
            if (this.fleet.get(i).battle(second.fleet.get(j))) {
                p++;
                j++;
            } else if (!(this.fleet.get(i).battle(second.fleet.get(j)))) {
                k++;
                i++;
            }
        }
        return p > k;
    }
}
