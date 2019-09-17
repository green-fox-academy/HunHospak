import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner bejov = new Scanner(System.in);
        String input = bejov.nextLine();
        System.out.println(Palindrome(input));
    }

    public static String Palindrome (String input) {
        String output = input;
        for (int i = input.length()-1; i >=0 ; i--) {
            output += input.charAt(i);

        }
        return output;
    }
}
