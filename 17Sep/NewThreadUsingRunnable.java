import java.*;

class MultiThread implements Runnable{
    public void run(){
        try{
            // Display the threads that are running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Exception is caught.");
        }
    }

}

public class NewThreadUsingRunnable{
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for(int i=0;i<n;i++){
            Thread obj = new Thread(new MultiThread());
            obj.start();
        }
    }
}