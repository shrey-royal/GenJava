import java.io.FileReader;
import java.io.FileWriter;

public class Task1 {
    public static void main(String[] args) {
        String sourceFileName = "source.txt";
        String targetFileName = "target.txt";

        try(
            FileReader reader = new FileReader(sourceFileName);
            FileWriter writer = new FileWriter(targetFileName);
        ) {
            char[] buffer = new char[4096]; // 4KB buffer
            int bytesRead;

            while((bytesRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, bytesRead);
            }

            System.out.println("File Copied Successfully.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

/*
1. Text File Copying:
   Design a Java program that reads the contents of one text file using a 'FileReader' and then writes the content to another text file using a 'FileWriter'. Ensure that the program handles file exceptions gracefully.
*/