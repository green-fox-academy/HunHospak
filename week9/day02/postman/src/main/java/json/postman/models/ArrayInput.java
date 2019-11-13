package json.postman.models;

import java.util.List;

public class ArrayInput {
  private String what;
  private List<Integer> numbers;

  public ArrayInput(String what, List<Integer> numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }
}
