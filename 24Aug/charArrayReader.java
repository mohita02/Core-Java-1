import java.io.*;
import java.util.*;

class CharArrayReaderDemo{
    public static void main(String[] args) throws IOException{
        CharArrayReader car = null;
        String s1 = "This is a character array.";
        int i;
        try {
            char[] a = s1.toCharArray();
            car = new CharArrayReader(a);
            while((i=car.read())!=-1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(car!=null){
                car.close();
            }
        }
    }
}