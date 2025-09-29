import java.io.*;
import java.net.*;
public class SimpleServer {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server started, waiting for client...");

            Socket socket = server.accept();
            System.out.println("client connected");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = br.readLine();
            System.out.println("client says:"+msg);

            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            pw.println("hello client , massage recieved !");
            socket.close();
            server.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}