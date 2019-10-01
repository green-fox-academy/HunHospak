package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  public ElectricGuitar () {
    name = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  @Override
  public void sound() {
    System.out.println("Twang");
  }
}
