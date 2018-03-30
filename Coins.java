import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Coins {
	
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>(Collections.reverseOrder());
		t.add(1);
		t.add(2);
		t.add(5);
		t.add(10);
		t.add(20);
		t.add(50);
		t.add(100);
		t.add(200);
		t.add(500);
		t.add(2000);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount for withdrawal: ");
		int n=sc.nextInt();
		findCoins(t,n);
		sc.close();
	}

	 static void findCoins(TreeSet<Integer> t,int n) {
		 int q,r,s=0;
		 Iterator<Integer> itr=t.iterator();
		 while(itr.hasNext()) {
			 r=itr.next();
			 q=n/r;
			 n=n%r;
			 s=s+q;
			 while(q!=0) {
			 System.out.println("Number of "+r+" coins:"+q);
			 break;
			 }
		 }
		 System.out.println("Total nuber of coins:"+s);
	}
}