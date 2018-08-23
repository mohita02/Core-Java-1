import java.io.*;

class BufferedInputStreamDemo{
    public static void main(String[] args) throws IOException{
        FileInputStream fin = null;
        BufferedInputStream bin = null;
        try {
            fin = new FileInputStream("./test1.txt");
            bin = new BufferedInputStream(fin);
            while(bin.available()>0){
                char c = (char)bin.read();
                System.out.print(c);
            }
            System.out.println();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(fin!=null){
                fin.close();
            }
            if(bin!=null){
                bin.close();
            }
        }
    }
}