package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Pirate> pirates = new ArrayList<>();
    Random random = new Random();
    int numberOfAlive = 0;

    public Ship() {
    }

    public void fillShip() {
        for (int i = 0; i < 1 + (int) (Math.random() * 50); i++) {
            this.pirates.add(new Pirate());
        }
    }

    public boolean battle(Ship second) {
        //    System.out.println("\n" + "A battle has commenced: " + "\n");
        if (this.numberOfAlive - pirates.get(0).drinking > second.numberOfAlive - second.pirates.get(0).drinking) {
            this.party();
            second.loser();
            return true;
        } else {
            second.party();
            this.loser();
            return false;
        }
    }

    public void loser() {
        for (int i = 0; i < (int) (Math.random() * this.pirates.size()); i++) {
            this.pirates.get(i).die();
        }
    }

    public void party() {
        for (int i = 0; i < (random.nextInt(this.pirates.size() * 2)); i++) {
            this.pirates.get(random.nextInt(this.pirates.size())).drinkSomeRums();
        }
    }

    public void status() {
        System.out.println("The ship has: " + pirates.size() + " pirates including the Captain.");
        Pirate captain = this.pirates.get(0);
        if (captain.dead) {
            System.out.println("The captain is: " + captain.isDead());
        } else if (captain.passedOut) {
            System.out.println("The captain is passed out.");
        } else {
            System.out.println("The captain is: " + captain.isDead() + "\n" + "He has consumed: " + captain.drinking + " of rum.");
        }
        this.numberOfAlive = 0;
        for (int i = 0; i < pirates.size(); i++) {
            if (!this.pirates.get(i).dead) {
                this.numberOfAlive++;
            }
        }
        System.out.println("The number of live members is: " + (this.numberOfAlive - 1));
    }
}

