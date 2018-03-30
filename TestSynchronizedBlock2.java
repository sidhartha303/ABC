package thread;

class Table1{
	void printTable(int n) {
		synchronized(this) {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

public class TestSynchronizedBlock2 {

	public static void main(String[] args) {		
		final Table1 obj=new Table1();
		Thread t1=new Thread(){
			public void run() {
				obj.printTable(10);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				obj.printTable(150);
			}
		};
		t1.start();  
		t2.start();  
	}
}