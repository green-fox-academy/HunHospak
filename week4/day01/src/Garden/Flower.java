package Garden;

public class Flower extends Plant {

    public Flower(double currentLevel, int addedWater, String color) {
        super(currentLevel, addedWater, color);
    }

    public void addingWater (double addedWater) {
        setCurrentLevel(addedWater*0.75);
    }


}
