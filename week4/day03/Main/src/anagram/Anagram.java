package anagram;

public class Anagram {
String reversedSecond;

  public void Reverse (String second) {
    reversedSecond="";
    for (int i = 0; i < second.length() ; i++) {
      this.reversedSecond += second.charAt(second.length()-1-i);
    }

  }

  public boolean isItAnagram(String first, String second) {
    Reverse(second);
    return first.equalsIgnoreCase(reversedSecond);
  }

}
