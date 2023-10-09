import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TransferImage {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        int ctr=0;  //this is to count the bytes transferred.

        try {
            in = new FileInputStream("input.png");
            out = new FileOutputStream("output.png");
            int c;  //to read the byte from the input file
            while((c = in.read()) != -1) {
                out.write(c);
                ctr++;
            }
        } catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if(in != null) {
                    in.close();
                }
                if(out != null) {
                    out.close();
                }
                System.out.println("Bytes transferred: " + ctr);
            } catch(Exception e) {
                System.err.println("Error: " + e.getMessage());
            }

            System.out.println("Transfer Done");
            System.out.println("Copied " + ctr + " bytes");
        }
    }
}

/*
Enter source filepath: "/Users/eduardo/Desktop/Java I-0/input.png"
Enter target dir: 

(current dir selected as target dir by default)

Bytes transferred: 1024

1. transfer
2. delete




*/