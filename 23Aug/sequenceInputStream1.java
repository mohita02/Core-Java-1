import java.io.*;

class SequenceInputStreamDemo{
    public static void main(String[] args) throws IOException{
        SequenceInputStream inst = null;
        FileInputStream fin = null;
        FileInputStream fin1 = null;
        FileOutputStream fout = null;
        try{
            fin = new FileInputStream("./test.txt");
            fin1 = new FileInputStream("./test1.txt");
            fout = new FileOutputStream("./test2.txt");
            inst = new SequenceInputStream(fin,fin1);
            int j;
            while((j=inst.read())!=-1){
                System.out.print((char)j);
                fout.write(j);
            }
            System.out.println();
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(inst!=null){
                inst.close();
            }
            if(fin!=null){
                fin.close();
            }
            if(fout!=null){
                fout.close();
            }
            if(fin1!=null){
                fin1.close();
            }
        }
    }
}