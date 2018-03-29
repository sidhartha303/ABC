package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HighProbab {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int r=0;
		ArrayList<Integer> a=new ArrayList<>();
		while(n>0) {
			r=n%10;
			a.add(r);
			n=n/10;
		}
		System.out.println("The highest probable number:");
		Collections.sort(a);
		
		Object[] item=a.toArray();
		
		for(int j=item.length-1;j>=0;j--) {
			System.out.print(item[j]);
		}
sc.close();
}}
