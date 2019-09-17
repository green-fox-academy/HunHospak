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
        for (int i=0; i<myList.size();i++) {
            ossz+=myList.get(i);
            if (max<myList.get(i)) {
                max=myList.get(i);
            }

            avg+=1;

        }
        for (int i=0; i<myList.size()-1;i++) {
            if (myList.get(i) > myList.get(i + 1)) {
                min = myList.get(i + 1);
            }
        }

        int mas=ossz/avg;
        System.out.println(ossz);
        System.out.println(max);
        System.out.println(min);
        System.out.println(mas);
    }
}
