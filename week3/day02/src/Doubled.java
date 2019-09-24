import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        try {
            Path myPath = Paths.get("duplicated-chars.txt");
            List<String> myList = Files.readAllLines(myPath);
            String myString;
            String theNew = "";
            List<String> newList = new ArrayList<>();
            for (int i = 0; i < myList.size() ; i++) {
                myString = myList.get(i);
                for (int j = 0; j < myString.length()-1 ; j++) {
                    if (myString.charAt(j)==myString.charAt(j+1)) {
                        j+=1;
                        theNew += myString.charAt(j);
                    }
                }
                theNew += "\n";
            }
            newList.add(0,theNew);
            Files.write(myPath,newList);
        } catch (IOException exception) {
        }
    }
}