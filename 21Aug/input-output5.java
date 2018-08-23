import java.io.*;

class ByteArrayOutputStreamDemo{
    public static void main(String[] args) throws IOException{
        ByteArrayOutputStream baot = new ByteArrayOutputStream();
        String s = "Content of byte array output stream";
        byte buffer[] = s.getBytes();
        baot.write(buffer);
        System.out.println("Size of buffer : " + baot.size());
        System.out.println("Buffer as a string");
        System.out.println(baot.toString());
        System.out.println("Into Array");
        for(byte b:buffer){
            System.out.print((char)b);
        }
        System.out.println("\nInto OutputStream");
        FileOutputStream fout = new FileOutputStream("./test.txt");
        baot.writeTo(fout);
        fout.close();
        baot.close();
    }
}