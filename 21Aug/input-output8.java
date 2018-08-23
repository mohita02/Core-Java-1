import java.io.*;

class BufferedOutputStreamDemo{
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = null;
        BufferedOutputStream bout = null;
        try{
            fout = new FileOutputStream("./buffer.txt");
            bout = new BufferedOutputStream(fout);
            String s = "This is a practice of buffered i/o streams.";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(fout!=null){
                fout.close();
            }
            if(bout!=null){
                bout.close();
            }
        }
    }
}