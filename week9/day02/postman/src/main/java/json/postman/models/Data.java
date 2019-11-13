package json.postman.models;

public class Data {
  private int received;
  private int result;

  public Data() {
  }

  public Data(int received) {
    this.received = received;
    this.result = received*2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
