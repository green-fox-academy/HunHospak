import java.util.Scanner;

public class PalindromeSearcherAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Searcher("hello");
        
    }

    public static void Searcher(String elso) {
        for (int i = 0; i <elso.length() ; i++) {
            for (int j = i+3; j <= elso.length() ; j++) {
                if (elso.substring(i,j).equalsIgnoreCase(Fordito(elso.substring(i,j)))) {
                    System.out.println(elso.substring(i,j));
                }
                
            }
            
        }
    }

    public static String Fordito(String input) {
        String szoveg="";
        for (int i = input.length()-1; i >=0 ; i--) {
            szoveg+=input.charAt(i);
        }
        return szoveg;
    }
}

// if i -> k.length ==
// heloka dog god sdaffffads dog god akoleh