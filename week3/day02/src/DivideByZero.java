import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.Scanner;

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

public class DivideByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Divider(num);
    }

    public static void Divider(int num) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(10/num);
        } catch (Exception exception) {
            System.out.println("Give me a non-zero number!");
            num = input.nextInt();
            Divider(num);
        }
    }
}
