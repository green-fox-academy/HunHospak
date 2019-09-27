package power;

public class Power {
    public static void main(String[] args) {
        System.out.println(toPower(2,5));
    }

    public static int toPower (int n, int p) {
        if (p==1) {
            return n;
        } else {
            return n * toPower(n,p-1);
        }
    }
}
