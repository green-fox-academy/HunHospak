package countletter;

import java.util.HashMap;

public class CountLetter {

  public HashMap<String, Integer> intoHashMap(String input) {
    HashMap<String, Integer> myHash = new HashMap<>();
    for (int i = 0; i < input.length(); i++) {
      myHash.put(input.substring(i,i+1),i);
    }
    return myHash;
  }

  public HashMap<String, Integer> intoHashMap() {
    return null;
  }
}
