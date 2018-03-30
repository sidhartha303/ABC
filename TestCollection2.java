package HashSet;

import java.util.HashSet;

public class TestCollection2 {

	int id;  
	String name;  
	int quantity;  
	public TestCollection2(int id, String name, int quantity) {  
	   this.id = id;  
	    this.name = name;  
	    this.quantity = quantity;  
	} 


	public String toString() {
		return id+" "+name+" "+quantity;
	}
	
	public static void main(String[] args) {
		HashSet<Object> set=new HashSet<Object>();  

			TestCollection2 b1=new TestCollection2(101,"MNB",2);  
		    TestCollection2 b2=new TestCollection2(102,"TRED",4);  
		    TestCollection2 b3=new TestCollection2(103,"OS",6);  
		    TestCollection2 b4=new TestCollection2(104,"KJL",8);
		    TestCollection2 b5=new TestCollection2(105,"POIS",10);

		    set.add(b1);  
		    set.add(b2);  
		    set.add(b3);  
		    set.add(b4);
		    set.add(b5);
		    set.add(null);
		    
		    for(Object b:set){  
		    System.out.println(b);  
		   }  
	}

}
