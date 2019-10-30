package helloworld.dependency.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor {

  public void printColor() {
    System.out.println("HEY I'M COLOR RED");
  }
}
