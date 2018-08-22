import java.io.*;

class FileInputStreamDemo{
	public static void main(String[] args) throws IOException{
        FileInputStream fir =  null;
        try{
			fir = new FileInputStream("./file1.txt");
            int i=0;
            //i=fir.read();
			while((i=fir.read())!=-1){
				System.out.print((char)i);
            }
            System.out.println();

		}
		catch(Exception e){
			System.out.print(e);
        }
        finally{
            fir.close();
        }
	}
}