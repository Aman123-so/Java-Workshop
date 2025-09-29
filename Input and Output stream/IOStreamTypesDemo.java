import java.io.*;

public class IOStreamTypesDemo {
    public static void main(String[] args) {
        
        String data = "Hello, Java I/O!";
        try {
            // Writing to file
            FileOutputStream fos = new FileOutputStream("bytesStream.txt");
            fos.write(data.getBytes());
            fos.close();

            // Reading from file
            FileInputStream fis = new FileInputStream("bytesStream.txt");
            int ch;
            System.out.println("Reading from bytes stream:");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch); // corrected here
            }
            fis.close();
        }catch (IOException e) {
           System.out.println("An error occure " + e.getMessage());
             e.getMessage();
    }
    }
    }