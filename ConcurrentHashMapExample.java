package map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {

	ConcurrentHashMap<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
    premiumPhone.put("Apple", "iPhone6");
    premiumPhone.put("HTC", "HTC one");
    premiumPhone.put("Samsung","S6");
    
   for(Map.Entry m:premiumPhone.entrySet()) {
	   System.out.println(m.getKey()+"-"+m.getValue());
   }
    
	}
}
