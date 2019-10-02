package sum;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SumTest {
  List<Integer> myTest = new ArrayList<>();
  Sum mySum = new Sum();

  @Test
  public void myTest_PositiveNumbers() {
    myTest.add(3);
    myTest.add(5);
    myTest.add(15);
    int result = mySum.myResult(myTest);
    assertEquals(result,23);
  }

  @Test
  public void myTest_EmptyList() {
    int result = mySum.myResult(myTest);
    assertEquals(result,0);
  }

  @Test
  public void myTest_OneDigit() {
    myTest.add(4);
    int result = mySum.myResult(myTest);
    assertEquals(result,4);
  }

  @Test
  public void myTest_NullValue() {
    try {
      myTest = null;
      int result = mySum.myResult(myTest);
      assertEquals(result, null);
    } catch (NullPointerException e) {
      e = null;
    }
  }
  }