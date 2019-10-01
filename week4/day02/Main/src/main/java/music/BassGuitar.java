package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar (int numberOfStrings) {
    name = "Bass Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  public BassGuitar () {
    name = "Bass Guitar";
    this.numberOfStrings = 4;
  }

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }
}
