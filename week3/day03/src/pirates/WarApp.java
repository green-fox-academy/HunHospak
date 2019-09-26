package pirates;

import java.util.ArrayList;

public class WarApp {
    public static void main(String[] args) {
        Armada first = new Armada();
        Armada second = new Armada();
        first.Shipbuilder();
        second.Shipbuilder();
        if (first.War(second)) {
            System.out.println("First Armada won!");
        } else {
            System.out.println("Second Armada won!");
        }

    }
}
