package pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship first = new Ship();
        Ship second = new Ship();
     /*   first.fillShip();
        second.fillShip();
        first.status();
        second.status();*/
        first.battle(second);
       /* first.status();
        second.status();*/

    }
}
