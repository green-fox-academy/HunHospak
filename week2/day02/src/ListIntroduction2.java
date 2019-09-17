import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        ArrayList<String> ListB = new ArrayList<>();
        for (int s=0; s<ListA.size();s++) {
            ListB.add(ListA.get(s));
        }
        System.out.println(ListA.contains("Durian"));
        ListA.add(4,"Kiwifruit");
        System.out.println("The size of list a is: " + ListA.size() + " The size of list b is: " + ListB.size());
        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));
        System.out.println(ListA.get(3));

    }
}
