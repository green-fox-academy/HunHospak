import java.util.ArrayList;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList <Integer> myList = new ArrayList<>();
        myList.add(500);
        myList.add(1000);
        myList.add(1250);
        myList.add(175);
        myList.add(800);
        myList.add(120);
        int ossz=0;
        int max = 0;
        int min=999;
        int avg=0;
        for (int i: myList) {
            ossz+=i;
            if (max<i) {
                max=i;
            }
            if (min>i) {
                min=i;
            }
            avg=ossz/i;

        }
        System.out.println(ossz);
        System.out.println(max);
        System.out.println(min);
    }
}
