package sum;

import anagram.Anagram;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Integer> myNums = new ArrayList<>();
    myNums.add(2);
    myNums.add(15);
    myNums.add(78);
    Sum mySum = new Sum();
    mySum.myResult(myNums);

    Anagram anagram = new Anagram();
    System.out.println(anagram.Reverse("hello"));

  }

}
