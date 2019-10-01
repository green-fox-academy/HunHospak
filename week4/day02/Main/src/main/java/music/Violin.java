package main.java.music;

public class Violin extends StringedInstrument {
  public Violin (int numberOfThings) {
    name = "Violin";
    this.numberOfStrings = numberOfThings;
  }

  public Violin () {
    name = "Violin";
    this.numberOfStrings = 4;
  }

  @Override
  public void sound() {
    System.out.println("Screech");
  }
}
