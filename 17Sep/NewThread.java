import java.util.*;
import java.lang.*;

class MultiThread extends Thread{
    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getId() + " is runnning.");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class NewThread{
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for(int i=0;i<8;i++){
            MultiThread th = new MultiThread();
            th.start();
        }
    }
}