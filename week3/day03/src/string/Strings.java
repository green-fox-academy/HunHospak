package string;

public class Strings {
    public static void main(String[] args) {
        System.out.println(changingX("hello xavi", ""));
    }

    public static String changingX(String text, String newText) {
        int i = 0;
        if (text.length() == 0) {
            return newText;
        } else {
            if (text.charAt(i) == 'x') {
                newText += 'y';
                i++;
                return changingX(text.substring(i), newText);
            } else {
                newText += text.charAt(i);
                i++;
            }
            return changingX(text.substring(i), newText);
        }
    }
}
