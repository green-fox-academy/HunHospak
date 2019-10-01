package Garden;

public class Plant {
    double currentLevel;
    int addedWater;
    String color;

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(double currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getAddedWater() {
        return addedWater;
    }

    public void setAddedWater(int addedWater) {
        this.addedWater = addedWater;
    }



    public Plant(double currentLevel, int addedWater, String color) {
        this.currentLevel = 0;
        this.addedWater = addedWater;
        this.color = color;
    }
}
