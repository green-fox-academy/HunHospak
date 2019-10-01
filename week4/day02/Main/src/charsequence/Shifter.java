package charsequence;

public class Shifter implements CharSequence {
  String text;
  int shift;

  public Shifter(String text, int shift) {
    this.text = text;
    this.shift = shift;
  }


  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    if (shift+index < text.length()-1) {
      return text.charAt(index+shift);
    } else {
      return text.charAt(index+shift%text.length());
    }
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
