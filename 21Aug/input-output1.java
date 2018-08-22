import java.io.*;

class FileInputStreamDemo{
    public static void main(String[] args) throws IOException{
        FileInputStream fir = null;
        int i=0;
        char c;
        byte by[] = new byte[20];
        try{
            fir = new FileInputStream("./file1.txt");
            System.out.println("No. of bytes : " + fir.available());
            //fir.mark(2);
            i = fir.read(by,4,8);
            System.out.println("No. of bytes read : " + i);
            System.out.println("Bytes Read");
            for(byte b:by){
                c = (char)b;
                System.out.print(c);
            }
            System.out.println();
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(fir!=null){
                fir.close();
            }
        }
    }
}