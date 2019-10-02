package fibonacci;

import java.util.ArrayList;

class Fibonacci {

  public ArrayList<Integer> Fibo(int input) {
    ArrayList<Integer> fiboContain = new ArrayList<>();
    int n1 = 0, n2 = 1, n3, i;
    if (input == 0) {
      fiboContain.add(n1);
      return fiboContain;
    } else if (input == 1) {
      fiboContain.add(n1);
      fiboContain.add(n2);
      return fiboContain;
    } else {
      fiboContain.add(n1);
      fiboContain.add(n2);
      for (i = 2; i < input; ++i)//loop starts from 2 because 0 and 1 are already printed
      {
        n3 = n1 + n2;
        fiboContain.add(n3);
        n1 = n2;
        n2 = n3;
      }
      return fiboContain;
    }
    }
  }