package sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {
  int result;

  public int myResult (List<Integer> Numbers) {
    for (int i = 0; i < Numbers.size() ; i++) {
      result += Numbers.get(i);
    }
    return result;
  }
}
