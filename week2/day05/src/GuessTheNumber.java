import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me the range: ");
        int range = input.nextInt();
        int number = ((int)(Math.random()*range));
        if (Dontes(number)) System.out.println("Congrats, you got it!");;
    }

    public static boolean Dontes (int number) {
        System.out.println("Give me your number: ");
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        for (int i=0;user!=number;user = input.nextInt()) {
            if (user>number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }

        } return true;
    }
}
