import java.io.*;

class InputOutputDemo{
    public static void main(String[] args) throws IOException{
        FileInputStream fin = null;
        FileOutputStream fout = null;
        byte[] buffer = new byte[20];
        byte[] b;
        int i=0;
        char c;
        try{
            fin = new FileInputStream("./file2.txt");
            fout = new FileOutputStream("./file3.txt");
            System.out.println("No. of bytes : " + fin.available());
            i=fin.read(buffer);
            System.out.println("No. of bytes read : " + i);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}