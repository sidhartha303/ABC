package thread;

class TestSync implements Runnable{
	
public synchronized void printTable() throws Exception {
	Thread.sleep(5000);
	System.out.println("Print Table");
}
	 public void run() {
		 System.out.println("Run");
	try {
		Thread.sleep(6000);
		printTable();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	System.out.println("After run");
	}
	public static void main(String[] args) {
		TestSync t=new TestSync();
		Thread t1=new Thread(t);
		t1.start();
		TestSync tx=new TestSync();
		Thread t2=new Thread(tx);
		t2.start();
}	}