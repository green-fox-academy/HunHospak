package countletter;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class CountLetterTest {

  @Test
  public void intoHashMap() {
    HashMap<String, Integer> test = new HashMap<>();
    CountLetter counnt = new CountLetter();
    System.out.println(counnt.intoHashMap("heloka"));
    test.put("a",5);
    test.put("e",1);
    test.put("h",0);
    test.put("k",4);
    test.put("l",2);
    test.put("o",3);
    assertEquals(counnt.intoHashMap("heloka"),test);
    assertEquals(counnt.intoHashMap(),null);
  }
}