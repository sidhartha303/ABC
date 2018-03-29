package algorithm;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int n=sc.nextInt();
		int a[]= new int[v];
		
		for(int i=0;i<v;i++) {
			a[i]=sc.nextInt();
		}
		int temp;
		
		
	//	Left Rotation
		  while(n>0) {
			temp=a[0];
		for(int i=0;i<a.length-1;i++) {
				a[i]=a[i+1];
		}
		n--;
		a[a.length-1]=temp;
		}
		
		/*  Right Rotation
		 * while(n>0) {
			temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
				a[i]=a[i-1];
		}
		n--;
		a[0]=temp;
		}
		*/
		
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		sc.close();
	}
}
