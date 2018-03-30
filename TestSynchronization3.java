package thread;

public class TestSynchronization3 implements Runnable{
	public static void main(String[] args) {
	System.out.println("This is currently running on the main thread,the id is: "+Thread.currentThread().getId());  
	TestSynchronization3 t=new TestSynchronization3();
	Thread t1=new Thread(t);
	t1.start();
	}
	
	public void run() {
	System.out.println("This is currently running on a separate thread,the id is: "+Thread.currentThread().getId());  
	}
}