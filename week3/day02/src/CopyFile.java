import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        Copy("my-file.txt", "example.txt");


    }

    public static void Copy(String from, String to) {
        try {
            Path fromPath = Paths.get(from);
            Path toPath = Paths.get(to);
            List<String> myList = Files.readAllLines(fromPath);
            Files.write(toPath,myList);
            System.out.println("The copy was successful");
        } catch (IOException exception) {
            System.out.println("The copy was unsuccessful");
        }
    }
}
