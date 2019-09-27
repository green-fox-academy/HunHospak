package commondivisor;

public class CommonDivisor {
    //To compute gcd(48,18), divide 48 by 18 to get a quotient of 2 and a remainder of 12. Then divide 18 by 12 to get a quotient of 1 and a remainder of 6. Then divide 12 by 6 to get a remainder of 0, which means that 6 is the gcd.
    public static void main(String[] args) {
        System.out.println(Divisor(36,18));
    }

    public static int Divisor (int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (Math.max(a,b)%Math.min(a,b)==0) {
            return Math.min(a,b);
        } else {
            return Divisor((Math.max(a,b)%Math.min(a,b)),Math.min(a,b));
        }

    }
}
