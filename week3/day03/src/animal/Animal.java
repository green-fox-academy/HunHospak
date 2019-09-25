package animal;

public class Animal {
    int hunger = 50;
    int thirst = 50;

    public Animal () {

    }

    public void Eat () {
        hunger--;
    }

    public  void Drink () {
        thirst--;
    }

    public void Play () {
        hunger++;
        thirst++;
    }
}
