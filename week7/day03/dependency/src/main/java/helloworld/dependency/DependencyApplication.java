package helloworld.dependency;

import helloworld.dependency.services.MyColor;
import helloworld.dependency.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;






@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  @Autowired
  public DependencyApplication(Printer printer, @Qualifier("red") MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencyApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }
}
