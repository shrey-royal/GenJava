import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class File1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileReader fr = null;
        FileWriter fw = null;
        // String text = null; //using null because if we don't use it, then the garbage collector will delete it

        while(true) {
            System.out.println("Please select an option: ");
            System.out.println("1. Create a new file");
            System.out.println("2. Write to the file");
            System.out.println("3. Read from the file");
            System.out.println("4. Delete the file");
            System.out.println("5. Get the file size");
            System.out.println("99. Exit the program");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    //create a new file
                    try {
                        fw = new FileWriter("File1.txt");
                        System.out.println("File created.");
                        fw.close();
                    } catch (Exception e) {
                        System.out.println("Error creating file: " + e.getMessage());
                    }
                    break;
                case 2:
                    //write to the file
                    try {
                        fw = new FileWriter("File1.txt");
                        sc.nextLine(); //this is to clear the buffer
                        System.out.println("Please enter the text you would like to write to the file: ");
                        fw.write(sc.nextLine());
                        System.out.println("Text written to file.");
                        fw.close();
                    } catch (Exception e) {
                        System.out.println("Error writing to a file: " + e.getMessage());
                    }
                    break;
                case 3:
                    //read from the file
                    try {
                        fr = new FileReader("File1.txt");
                        int i;  //this is the ascii value of the character
                        while((i = fr.read()) != -1) {
                            System.out.print((char) i);
                        }
                        System.out.println();
                        fr.close();
                    } catch (Exception e) {
                        System.out.println("Error reading from file: " + e.getMessage());
                    }
                    break;
                case 4:
                    //delete the file
                    try {
                        File file = new File("File1.txt");
                        if (file.delete()) {
                            System.out.println("File deleted.");
                        } else {
                            System.out.println("File not deleted.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error deleting file: " + e.getMessage());
                    }
                    break;
                case 5:
                    //get the file size
                    try {
                        File file = new File("File1.txt");
                        System.out.println("File size: " + file.length() + " bytes");
                    } catch (Exception e) {
                        System.out.println("Error getting file size: " + e.getMessage());
                    }
                    break;
                case 99:
                    //exit the program
                    if(fw != null) {
                        try {
                            fw.close();
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }//end if
                    if(fr != null) {
                        try {
                            fr.close();
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }//end if
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }//end switch
        }//end while
    }//end main
}//end class

/*
We will write a program that will do the following:

1. Create a new file
2. Write to the file
3. Read from the file
4. Delete the file

*/