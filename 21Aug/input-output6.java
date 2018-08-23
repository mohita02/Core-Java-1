import java.io.*;

class InputOutputStreamDemo{
    public static void main(String[] args) throws IOException{
        ByteArrayInputStream bin = null;
        ByteArrayOutputStream bout = null;
        String s = "Hello my name is Mayank Khanna";
        byte buffer[] = s.getBytes();
        int i;
        try{
            bin = new ByteArrayInputStream(buffer);
            bout = new ByteArrayOutputStream();
           // bout.write(buffer);
            byte b[] = new byte[bin.available()];
            int j=0;
            while((i=bin.read())!=-1){
                if(i>='a' && i<='z'){
                    i-=32;
                }
                b[j] = (byte)i;
                j++;
            }
            bout.write(b);
            System.out.println(bout.toString());
            // for(byte by:b){
            //     System.out.print(by);
            // }
            System.out.println("\n Writing to file");
            FileOutputStream fout = new FileOutputStream("./test1.txt");
            bout.writeTo(fout);
            fout.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("File written successfully");
            bin.close();
            bout.close();
        }
    }
}