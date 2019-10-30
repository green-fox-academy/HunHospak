package colorpage.coloring;

import colorpage.coloring.services.MyColor;
import colorpage.coloring.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  @Autowired
  public ColoringApplication(Printer printer, @Qualifier("red") MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(ColoringApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }
}
