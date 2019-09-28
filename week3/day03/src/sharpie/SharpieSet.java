package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies = new ArrayList<>();

    public void CountUsable() {
        int counter = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                counter++;
            }
        }
    }

    public void RemoveTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0) {
                sharpies.remove(i);
            }
        }
    }
}
