import java.io.*;

class InputOutputDemo{
    public static void main(String[] args) throws IOException{
        FileInputStream fin = null;
        FileOutputStream fout = null;
        byte[] buffer = new byte[20];
        int i=0;
        try{
            fin = new FileInputStream("./file2.txt");
            fout = new FileOutputStream("./file3.txt");
            System.out.println("No. of bytes : " + fin.available());
            i=fin.read(buffer);
            System.out.println("No. of bytes read : " + i);
            System.out.println("Writing data to file");
            fout.write(buffer);
            for(byte b:buffer){
                System.out.print((char)b);
            }
            System.out.println();
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            fin.close();
            fout.close();
        }
    }
}