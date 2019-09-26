package pirates;

public class Pirate {
    public int drinking = 0;
    public boolean dead = false;
    private int kill = 0;
    public boolean passedOut = false;
    private String isDead = "";
    public Pirate () {
    }
    public void drinkSomeRums() {
        if (this.dead) {
            System.out.println("He is dead");
            this.drinking = -1;
        } else {
            this.drinking++;
        }
    }
    public void howItsGoingMate() {
        if ((0<=this.drinking)&&(this.drinking < 4)) {
            System.out.println("Pour me anudder!");
        } else if (this.drinking == 4) {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.passedOut = true;
        } else {
            System.out.println("He is dead!");
        }
    }
    public boolean die () {
        this.drinking = -1;
        this.dead = true;
        return dead;
    }
    public void brawl (Pirate second) {
        if (!this.dead && !second.dead) {
            this.kill = (int)(Math.random()*3);
            if (this.kill==1) {
                this.dead = true;
            } else if (this.kill==2) {
                second.dead = true;
            } else if (this.kill==3) {
                this.passedOut = true;
                second.passedOut = true;
            }
        } else {
            System.out.println("One of the pirates is dead!");
        }
    }
    public String isDead() {
       return this.isDead = this.dead ? "is dead." : "is alive!";
    }

}


