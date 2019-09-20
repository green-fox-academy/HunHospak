import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String elso = input.nextLine();
        String masodik = input.nextLine();
        if (AnagramQuestion(elso,masodik)) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }


    public static boolean AnagramQuestion(String elso, String masodik) {
        if (elso.equalsIgnoreCase(AnagramChanger(masodik))) {
            return true;
        } else {
            return false;
        }
    }

    public static String AnagramChanger(String masodik) {
        String vissza = "";
        for (int i = masodik.length()-1; i >= 0; i --) {
            vissza+=masodik.charAt(i);
        }
        return vissza;
    }
}

