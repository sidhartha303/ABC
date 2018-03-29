package algorithm;

import java.util.Scanner;

public class GenPythagorean {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int a=(int)(Math.abs((Math.pow(m, 2))-(Math.pow(n, 2))));
		int b=2*m*n;
		int c=(int)(Math.abs((Math.pow(m, 2))+(Math.pow(n, 2))));
		
		System.out.println("Pythagorean Triples:"+a+" "+b+" "+c);
		sc.close();
	}

}
