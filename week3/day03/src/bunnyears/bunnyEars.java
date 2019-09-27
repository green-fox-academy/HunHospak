package bunnyears;

public class bunnyEars {
    public static void main(String[] args) {
        System.out.println(bunnyEars(5));

    }

    public static int bunnyEars (int bunny) {
        if (bunny==0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunny - 1);
        }
    }
}
