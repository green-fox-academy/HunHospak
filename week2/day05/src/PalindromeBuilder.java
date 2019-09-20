import java.util.Scanner;

public class PalindromeBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myPalind = input.nextLine();
        System.out.println("The palindrom is: " + Palindrome(myPalind));
    }

    public static String Palindrome (String input) {
        String solution =input;
        for (int i = input.length()-1; i >= 0 ; i--) {
            solution+=input.charAt(i);
        }
        return solution;
    }
}
