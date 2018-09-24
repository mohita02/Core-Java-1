import java.*;

class NewMultipleThread implements Runnable{
    String name;
    Thread t;
    NewMultipleThread(String ThreadName){
        name = ThreadName;
        t = new Thread(this,name);
        System.out.println("New Thread : " + t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(name + " interrupted");
        }
        System.out.println("Exiting " + name);
    }
}

public class MultipleThreads{
    public static void main(String[] args) {
        NewMultipleThread t1 = new NewMultipleThread("One");
        NewMultipleThread t2 = new NewMultipleThread("Two");
        NewMultipleThread t3 = new NewMultipleThread("Three");
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting Main Thread");
    }
}