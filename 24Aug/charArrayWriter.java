import java.io.*;

class CharArrayWriterDemo{
    public static void main(String[] args) throws IOException{
        CharArrayWriter caw = null;
        FileWriter fw = new FileWriter("./test.txt");
        String s = "This is a sample string for data.\n";
        char[] charArray = s.toCharArray();
        try{
            caw = new CharArrayWriter();
            caw.write(charArray);
            caw.writeTo(fw);
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(fw!=null){
                fw.close();
            }
            if(caw!=null){
                caw.close();
            }
        }
    }
}