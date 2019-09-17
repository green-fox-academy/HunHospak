import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList <String> myArr = new ArrayList<>();
        myArr.add("eggs");
        myArr.add("milk");
        myArr.add("fish");
        myArr.add("apples");
        myArr.add("bread");
        myArr.add("chicken");

        System.out.println(myArr.contains("milk"));
        System.out.println(myArr.contains("bananas"));
    }
}
