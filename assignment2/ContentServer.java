import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.net.*;
public class ContentServer {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());  

            dout.writeUTF(put());  
            dout.flush();  

            dout.close();  
            s.close();  
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static String lamport() {
        return "0";
    }

    static String put() {
        return "content";
    }
}