import java.io.*;

class FileReaderDemo{
    public static void main(String[] args) {
        FileReader fr = null;
        int i;
        try{
            fr = new FileReader("./file.txt");
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(fr!=null){
                    fr.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

