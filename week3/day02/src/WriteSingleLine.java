import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        WritingFunc("hello");
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

    }
    public static void WritingFunc (String input) {
        try {
            List<String> myList = new ArrayList();
            myList.add(input);
            Path newFile = Paths.get("my-file.txt");
            Files.write(newFile,myList);
        } catch (IOException exception) {
            System.out.println("Unable to write file: " + input);
        }
    }
}