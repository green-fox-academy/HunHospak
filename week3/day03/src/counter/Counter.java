package counter;

public class Counter {
    int num = 0;
    int original = 0;

    public Counter() {
    }

    public Counter(int num) {
        this.num = num;
        this.original = num;
    }

    public void add() {
        this.num++;
    }

    public void add(int num) {
        this.num += num;
    }

    public void reset() {
        this.num = original;
    }

    public int get() {
        System.out.println(this.num);
        return this.num;
    }
}
