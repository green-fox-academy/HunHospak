import java.util.Scanner;
public class PalindromeSearcher2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String szoveg = input.nextLine();
        PalindromeSearcher(szoveg);
     /*   String adding = szoveg + Reverse(szoveg);*/


    }

    public static boolean isEqualto (String input) {
        if (input.equals(Reverse(input))) {
            return true;
        } else {
            return false;
        }
    }

    public static void PalindromeSearcher (String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+3; j <= input.length(); j++) {
                if (isEqualto(input.substring(i,j))) {
                    System.out.println(input.substring(i,j));
                }
                
            }
            
        }
    }

    public static String Reverse(String input) {
        String elso = "";
        for (int i = input.length()-1; i >= 0; i--) {
            elso+=input.charAt(i);
        }
        return elso;
    }

}
