package fibonacci;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class FibonacciTest {

  @Test
  public void fibo() {
    Fibonacci input = new Fibonacci();
    input.Fibo(10);
    ArrayList<Integer> test = new ArrayList<> (Arrays.asList(0,1,1,2,3,5,8,13,21,34));
    assertEquals(test, input.Fibo(10));
  }

  @Test
  public void fibo_Zero() {
    Fibonacci input = new Fibonacci();
    input.Fibo(10);
    ArrayList<Integer> test = new ArrayList<> (Arrays.asList(0));
    assertEquals(test, input.Fibo(0));
  }
}