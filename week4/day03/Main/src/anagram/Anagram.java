package anagram;

public class Anagram {
String reversedSecond;

  public String Reverse (String second) {
    reversedSecond="";
    for (int i = 0; i < second.length() ; i++) {
      this.reversedSecond += second.charAt(second.length()-1-i);
    }
    return this.reversedSecond;
  }

  public boolean isItAnagram(String first, String second) {
    reversedSecond = Reverse(second);
    return first.equalsIgnoreCase(reversedSecond);
  }

}
