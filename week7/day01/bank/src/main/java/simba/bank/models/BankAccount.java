package simba.bank.models;

public class BankAccount {
  String name;
  Double balance;
  String animalType;
  boolean isKing;
  boolean isBad;

  public BankAccount(String name, Double balance, String animalType, boolean isKing, boolean isBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isBad = isBad;

  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public boolean isBad() {
    return isBad;
  }

  public void setBad(boolean bad) {
    isBad = bad;
  }
}
