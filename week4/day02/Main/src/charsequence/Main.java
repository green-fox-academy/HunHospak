package charsequence;

public class Main {

  public static void main(String[] args) {
    CharSequence g = new Gnirts("fene");
    System.out.println(g.charAt(2));
    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
    // should print out: a
  }

}
