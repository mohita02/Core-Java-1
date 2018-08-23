import java.io.*;

class SequenceInputStreamDemo{
    public static void main(String[] args) throws IOException{
        String s1 = "Hello";
        String s2 = "World";
        byte b[] = s1.getBytes();
        byte b2[] = s2.getBytes();

        ByteArrayInputStream is1 = new ByteArrayInputStream(b);
        ByteArrayInputStream is2 = new ByteArrayInputStream(b2);
        SequenceInputStream sis = new SequenceInputStream(is1,is2);
        try{
            System.out.println("Available bytes : " + sis.available());
            for(int i=0;i<10;i++){
                char c = (char)sis.read();
                System.out.print(c+" ");
            }
            System.out.println();
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(sis!=null){
                sis.close();
            }
        }
    }
}