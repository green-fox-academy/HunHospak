package counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter ();
        counter.add(5);
        counter.get();
        counter.reset();
        counter.reset();
        Counter counter2 = new Counter(10);
        counter2.add(2);
        counter2.add(3);
        counter2.get();
        counter2.reset();
        counter2.get();



    }
}
