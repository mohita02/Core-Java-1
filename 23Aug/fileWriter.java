import java.io.*;

class FileWriterDemo{
    public static void main(String[] args) throws IOException{
        FileWriter fw = null;
        try{
            fw = new FileWriter("./fileWriter.txt");
            fw.write('A');
            String data = "\nThis is a sample data to be written in the file.";
            fw.write(data,5,10);
            char[] charData = data.toCharArray();
            fw.write(charData);
            fw.append("\nEnd of the Code");
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(fw!=null){
                fw.close();
            }
        }

    }
}