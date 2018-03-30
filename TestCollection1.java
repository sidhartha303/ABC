package HashSet;

import java.util.HashSet;
import java.util.Iterator;


public class TestCollection1 {
	
	int id;
	String name;
	TestCollection1(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
	public static void main(String[] args) {

		HashSet<Object> s=new HashSet<Object>();
		s.add(1);
		s.add(2);
		s.add(987);
		TestCollection1 n1=new TestCollection1(142,"SSS");
		TestCollection1 n2=new TestCollection1(143,"TTT");
		s.add(n1);
		s.add(n2);
		s.remove(2);
Iterator<Object> i=s.iterator();
while(i.hasNext()){
	System.out.println(i.next().toString());
}
}
}