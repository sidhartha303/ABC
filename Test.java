package TreeSet;

import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test implements Runnable{

	public void run() {
        System.out.println(Thread.currentThread().getName());  		
	}
	/*private String message;  
	    public  Test(String s){  
	        this.message=s;  
	   }  
	     public void run() {  
	        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
	       processmessage();//call processmessage method that sleeps the thread for 2 seconds  
	        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
	    }  
	    private void processmessage() {  
	        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
	   }  */

	
	public static void main(String[] args) {

		/*Set<Integer> s=new TreeSet<>();
		s.add(987);
		s.add(9876);
		s.add(543);
		s.add(12);
		Spliterator<Integer> a=s.spliterator();
		a.forEachRemaining(System.out::println);
	
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		t1.setDaemon(true);
		    
		 t1.start();  
		 t2.start();  
		 t3.start();  */
		
		/*ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
		       for (int i = 0; i < 10; i++) {  
	           Runnable worker = new Test("" + i);  
		           executor.execute(worker);//calling execute method of ExecutorService  
	          }  
	       executor.shutdown();  
		       while (!executor.isTerminated()) {   }  
		        System.out.println("Finished all threads");  
*/		
		/*Test runnable=new Test();
		ThreadGroup tg1=new ThreadGroup("Parent ThreadGroup");
		Thread t1 = new Thread(tg1, runnable,"one");  
		          t1.start();  
		          Thread t2 = new Thread(tg1, runnable,"two");  
		          t2.start();  
		          Thread t3 = new Thread(tg1, runnable,"three");  
		          t3.start();  
		              
		          System.out.println("Thread Group Name: "+tg1.getName());  
		          tg1.list();  */
		
		
		
		
}	
	}
