import java.io.*;

class ByteArrayInputStreamDemo{
    public static void main(String[] args) throws IOException{
        String str = "abcdefghijklmnopqrstuvwxyz";
        byte buffer[] = str.getBytes();
        ByteArrayInputStream bais = null;
        int i;
        try{
            bais = new ByteArrayInputStream(buffer);
            while((i=bais.read())!=-1){
                System.out.print((char)i + " ");
            }
            System.out.println();
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(bais!=null){
                bais.close();
            }
        }

    }
}