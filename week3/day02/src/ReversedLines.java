import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        String reversed="";
        Path myPath = Paths.get("reversed-lines.txt");
        try {
            List<String> myList = Files.readAllLines(myPath);
            for (int i = 0; i < myList.size() ; i++) {
                for (int j = myList.get(i).length()-1; j >= 0 ; j--) {
                    reversed += myList.get(i).charAt(j);
                }
                reversed += "\n";
            }
            List<String> newList = new ArrayList<>();
            newList.add(reversed);
            Files.write(myPath,newList);
        } catch (IOException e) {
        }
    }
}
