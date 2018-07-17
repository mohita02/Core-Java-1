import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Buffer{
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        try{
            System.out.print("Enter a character: ");
            char ch = (char)br.read();
            
            System.out.print("Enter a string: ");
            br.readLine();
            String ln = br.readLine();
            System.out.print("Enter an integer: ");
            int i  = Integer.parseInt(br.readLine());
            System.out.println("String : " + ln + "\n Integer : " + i + "\n Character : " + ch);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}