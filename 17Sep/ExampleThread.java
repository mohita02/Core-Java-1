import java.*;

class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread(this,"Demo Thread");
        System.out.println("Childe Thread : " + t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread : " + i);
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child Interupted");
        }
        System.out.println("Exiting child thread");
    }
}

public class ExampleThread{
    public static void main(String[] args) {
        NewThread t = new NewThread();
        try {
            for(int i=5;i>0;i--){
                System.out.println("Main Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interupted");
        }
        System.out.println("Exiting Main thread");
    }
}