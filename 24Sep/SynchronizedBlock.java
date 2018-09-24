class Table{
 	synchronized static void printTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}

class MyThreadClass1 extends Thread{
	public void run(){
		Table.printTable(5);
		System.out.println("Thread 1 exiting");
	}
}

class MyThreadClass2 extends Thread{
	public void run(){
		Table.printTable(10);
		System.out.println("Thread 2 exiting");
	}
}

public class SynchronizedBlock{
	public static void main(String[] args){
		MyThreadClass1 t1 = new MyThreadClass1();
		MyThreadClass2 t2 = new MyThreadClass2();
		t1.start();
		t2.start();
	}
}
