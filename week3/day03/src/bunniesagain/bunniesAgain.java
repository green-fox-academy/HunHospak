package bunniesagain;

public class bunniesAgain {
    public static void main(String[] args) {
        System.out.println(Bunnies(6));
    }

    public static int Bunnies(int number) {
        if (number == 0) {
            return number;
        } else if (number % 2 == 1) {
            return 2 + Bunnies(number - 1);
        } else {
            return 3 + Bunnies(number - 1);
        }
    }
}

