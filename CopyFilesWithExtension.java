package file;
 
import java.io.File;  
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.FilenameFilter;
import java.io.InputStream; 
import java.io.OutputStream; 
 
public class CopyFilesWithExtension extends Thread {
	
	String sourceFolder = "D://"; 
	String targetFolder = "D://test";
	File sFile = new File(sourceFolder);
	
	File[] sourceFiles = sFile.listFiles(new FilenameFilter() { 
		public boolean accept(File dir, String name) { 
		if(name.endsWith(".txt")) {
		return true; 
		}else { 
		return false; 
		}} 
		});
	
	public static void main(String[] args) throws Exception { 
		for(int i=0;i<5;i++) {
			new CopyFilesWithExtension().start();
			try { Thread.sleep(1000); }
		      catch (InterruptedException e) { e.printStackTrace(); }
		    }
		}
	
	
	public void run() {
			for(File fSource:sourceFiles) { 
				File fTarget = new File(new File(targetFolder), fSource.getName()); 
				try {
					copyFile(fSource,fTarget);
				} catch (Exception e) {
					e.printStackTrace();
				} 
			} 
			System.out.println("FILES COPIED FROM SOURCE TO DESTINATION");
		}
	
	private static void copyFile(File source, File dest) throws Exception { 
		try { 
			InputStream	is = new FileInputStream(source); 
			OutputStream	os = new FileOutputStream(dest); 
				byte[] buffer = new byte[100]; 
				int length; 
				while ((length = is.read(buffer)) > 0) { 
				os.write(buffer, 0, length); 
			} 
				is.close(); 
				os.close(); 
		}catch(Exception ex) { 
			System.out.println("Unable to copy file:"+ex.getMessage()); 
		} 
	}}