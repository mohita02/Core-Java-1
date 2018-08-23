import java.io.*;
import java.util.*;

class PrintStreamDemo{
    public static void main(String[] args){
        FileOutputStream fout = null;
        PrintStream ps = null;
        try{
            fout = new FileOutputStream("./file1.txt");
            ps = new PrintStream(fout);
            ps.println('A');
            ps.println(100L);
            ps.println(45.451);
            ps.println(new Date());
            ps.println();
            ps.println("This is an example of Print Stream Class\n");
            ps.append('a');
            ps.append("\nAppend Method of PrintStream\n");
            String str = "Example Print Stream";
            byte[] b = str.getBytes();
            ps.write(b);
            ps.printf("This is a %s application.",str);
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(fout!=null){
                    fout.close();
                }
                if(ps!=null){
                    ps.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}