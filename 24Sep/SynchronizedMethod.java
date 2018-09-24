class Table{
	synchronized void printTable(int n){
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
	Table t;
	MyThreadClass1(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(5);
		System.out.println("Thread 1 Exiting");
	}
}

class MyThreadClass2 extends Thread{
	Table t;
	MyThreadClass2(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(10);
		System.out.println("Thread 2 Exiting");
	}
}

public class SynchronizedMethod{
	public static void main(String[] args){
		Table obj = new Table();
		MyThreadClass1 t1 = new MyThreadClass1(obj);
		MyThreadClass2 t2 = new MyThreadClass2(obj);
		t1.start();
		t2.start();
	}
}
