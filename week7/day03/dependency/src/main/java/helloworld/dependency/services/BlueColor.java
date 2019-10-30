package helloworld.dependency.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class BlueColor implements MyColor {

  public void printColor() {
    System.out.println("HI IAM BLUE");
  }
}
