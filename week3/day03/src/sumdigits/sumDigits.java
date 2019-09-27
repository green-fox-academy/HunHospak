package sumdigits;

public class sumDigits {
    public static void main(String[] args) {
        System.out.println(Adding(739));

    }

    public static int Adding (int digits) {
        if (digits / 10 == 0 || digits / 10 ==1) {
            return digits%10;
        }
        else {
            return digits % 10 + (Adding(digits/10));
        }
    }
}
