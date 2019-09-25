package sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("red", 5.5f);
        sharpie.Use();
        System.out.println(sharpie.inkAmount);
    }
}
