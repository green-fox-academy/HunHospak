import java.util.ArrayList;

public class ListIntroduction {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        System.out.println(myList.size());
        myList.add("William");
        System.out.println(myList.isEmpty());
        myList.add("John");
        myList.add("Amanda");
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        for (int i=0; i<myList.size();i++) {
            System.out.println(myList.get(i));
        }
        for (int i=0; i<myList.size();i++) {
            System.out.println(i + ". " + myList.get(i));
        }
        myList.remove(2);
        myList.clear();
    }
}
