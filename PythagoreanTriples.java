package algorithm;

import java.util.Scanner;

public class PythagoreanTriples {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:  ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max,z,x; 
		
		if(a>b &&a>c) {
			max=a;
			x=b;
			z=c;
		}
		else if(b>a && b>c) {
			max=b;
			x=a;
			z=c;
		}
			
		else {
			max=c;
			x=a;
			z=b;
		}
		
		if((max*max)==((x*x)+(z*z)))
			System.out.println("Pythagorean Triplets");

		else
			System.out.println("Not Pythagorean Triplets");

		sc.close();
	   }
	}
