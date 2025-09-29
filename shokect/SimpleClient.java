
import java.io.*;
import java.net.*;

public class SimpleClient{
    public static void main(String [] args){
       try {
           Socket socket = new Socket("localhost",5000);

           PrintWriter pw = new PrintWriter (socket.getOutputStream(), true);
           pw.println("Hello Server");
           BufferedReader br= new BufferedReader (new InputStreamReader(socket.getInputStream()));
           String reply = br.readLine();
           System.out.println("Server says: " + reply);
           socket.close();
       } catch ( Exception e) {
        System.out.println("e");
       } 
    }
}