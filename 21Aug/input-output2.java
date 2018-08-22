import java.io.*;

class FileOutputStreamDemo{
    public static void main(String[] args) throws IOException{
        FileOutputStream fir = null;
        String str = "Data is to be written to the file";
        try {
             fir = new FileOutputStream("./file2.txt");
             byte byteArray[] = str.getBytes();
             fir.write(byteArray);
             System.out.println("Data Written Successfully !");
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            if(fir!=null){
                fir.close();
            }
        }
    }
}