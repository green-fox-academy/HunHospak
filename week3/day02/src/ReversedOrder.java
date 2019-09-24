import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.get;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        try {
            Path myPath = Paths.get("reversed-order.txt");
            List<String> myList = Files.readAllLines(myPath);
            List<String> newList = new ArrayList <String> ();
            int j = 0;
            for (int i = myList.size()-1; i >= 0  ; i--) {
                newList.add(j,myList.get(i));
                j++;
            }
            Files.write(myPath,newList);
        } catch (IOException e) {}

    }
}