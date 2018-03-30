package map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test{

	public static void main(String[] args) {

		 Map<Integer, String> testMap = new TreeMap<Integer, String>(Collections.reverseOrder());
	        testMap.put(10, "a");
	        testMap.put(20, "b");
	        testMap.put(30, "c");
	        testMap.put(40, "d");
   		for(Map.Entry m:testMap.entrySet()) {
		System.out.println(m.getKey()+"-"+m.getValue());
	       }
   		
		try {
			FileOutputStream f=new FileOutputStream("D:\\ZZ.txt");
			String s="Welcome to Galaxe";
			byte[] b=s.getBytes();
			f.write(b);
			f.close();
			System.out.println("Success");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			FileInputStream fin=new FileInputStream("D:\\ZZ.txt");
			int i=0;    
			while((i=fin.read())!=-1){    
		    	  System.out.print((char)i);    
		    }    
			fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println();
		HashMap<Integer, String> m=new HashMap<>();
		m.put(1,"A");
		m.put(2,"B");
		m.put(3,"C");
		
		for(Map.Entry n:m.entrySet()) {
			System.out.println(n.getKey()+"-"+n.getValue());
		}
		
		
	}		
}