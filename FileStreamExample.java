package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileStreamExample {

	public static void main(String[] args) throws Exception {
 
		BufferedWriter out = new BufferedWriter(new FileWriter("D://myfile.txt"));
        out.write("RCB");
        out.close();
        out = new BufferedWriter(new FileWriter("filename",true));
        out.write("CSK");
        out.close();
        BufferedReader in = new BufferedReader(new FileReader("filename"));
        String str;
        
        while ((str = in.readLine()) != null) {
           System.out.println(str);
        }
     in.close();

		FileInputStream fin=new FileInputStream("D://myfile.txt");
		int i=0;
		while((i=fin.read())!=-1)
			System.out.print((char)i);
		fin.close();
	}
}
