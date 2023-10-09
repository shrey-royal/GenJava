import java.io.FileReader;
import java.io.FileWriter;

public class FileTask4 {
    public static void main(String[] args) {
        String inputFile = "input.log";
        String outputFile = "summary.txt";
        
        try {
            FileReader fr = new FileReader(inputFile);
            FileWriter fw = new FileWriter(outputFile);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
4. Log File Analysis:
   Develop a Java application that reads a log file using a 'FileReader', extracts relevant information (e.g., timestamps, error messages), and generates a summary report. Write this report to a separate text file using a 'FileWriter'. The program should handle log file variations and errors.

*/