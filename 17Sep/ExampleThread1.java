import java.*;

class NewThread extends Thread{
    NewThread(){
        super("Demo Thread");
        System.out.println("Child Thread : " + this);
        start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread : " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child Interuppted");
        }
        System.out.println("Exiting Child Thread");
    }
}

public class ExampleThread1{
    public static void main(String[] args) {
        NewThread t = new NewThread();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread interuppted");
        }
        System.out.println("Exiting Main thread");
    }
}