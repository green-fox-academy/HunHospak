import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        Scanner input = new Scanner(System.in);
        String example = input.nextLine();
        FileName(example);
    }

    public static void FileName(String name) {
        int all = 0;
        try {
            Path filePath = Paths.get(name);
            List<String> files = Files.readAllLines(filePath);
            for (int i = 0; i < files.size(); i++) {
                all++;
            }
            System.out.println(all);
        } catch (IOException exception) {
            System.out.println(0);
        }
    }
}
