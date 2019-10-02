package anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  @Test
  public void isItAnagram() {
    Anagram anagram = new Anagram();
    assertFalse(anagram.isItAnagram("hello", "viszlat"));

    assertTrue(anagram.isItAnagram("hello","olleh"));
  }

}