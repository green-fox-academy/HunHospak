import java.util.Scanner;
public class PalindromeSearcher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String szoveg = input.nextLine();
        System.out.println(Palindrome(szoveg));

    }

    public static String Palindrome(String input) {
        String szoveg = "";
        for (int i = 0; i < input.length()-3 ; i++) {
            if (input.charAt(i) == input.charAt(input.length()-i-1)) {
                szoveg += input.charAt(i);
            }

        }
        return szoveg;
    }
}
