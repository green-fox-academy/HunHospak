import java.util.Scanner;
public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();
        System.out.println("the factorial of your number is: " + factorial(number));
    }

    public static int factorial( int input ) {
        int sum=input;
        for (int i = input-1; i > 0 ; i--) {
            sum*=i;

        }
        return sum;
    }
}
