package algorithm;

import java.util.Scanner;

public class Array2d {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),s=0; 
		int[][] a=new int[n][n];
		
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
				}
			}
		
		for(int i2=0;i2<n;i2++) {
			for(int j=0;j<n;j++) {
				if(i2==j)
					s=s+a[i2][j];
			}
		}
		int i1=0,j=n-1,s1=0;
		
		while(i1<n && j>=0) {
			s1=s1+a[i1][j];
			i1++;
			j--;
		}
		
		System.out.println(java.lang.Math.abs(s-s1));
		sc.close();
	}

}
