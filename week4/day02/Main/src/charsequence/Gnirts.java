package charsequence;

public class Gnirts implements CharSequence {
  private String bejovo;

  public Gnirts(String bejovo) {
    this.bejovo = bejovo;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return this.bejovo.charAt(this.bejovo.length()-index-1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
