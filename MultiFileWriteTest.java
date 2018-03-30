package HashSet;
import java.io.*; 


public class MultiFileWriteTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
	    {
	      new FileWriteThread("thread" + i + ".html").start();
	      try { Thread.sleep(500); }
	      catch (InterruptedException e) { e.printStackTrace(); }
	    }
	  }
	  
	  private static  class FileWriteThread extends Thread
	  {
	    private String fileName;
	  
	    public FileWriteThread(String fileName)
	    {
	      this.fileName = fileName;
	    }
	  
	    public void run()
	    {
	      try
	      {
	        PrintWriter pw = new PrintWriter(new FileWriter(fileName));
	        pw.println("<html><title>Sample HTML file " + fileName + "</title><body>");
	        System.out.println("Started " + fileName);
	        for (int i = 1; i <= 10; i++)
	        {
	          pw.println("<p>line " + i + "</p>");
	          try { Thread.sleep(1000); }
	          catch (InterruptedException e) { e.printStackTrace(); }
	        }
	        pw.println("</body></html>");
	        pw.close();
	        System.out.println("Ended " + fileName);
	      }
	      catch (Exception e) { e.printStackTrace(); }
	    }
	  }
	}