package algorithm;

import java.util.Scanner;

public class ComboMeal {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] fp = new int[n];
		
		for(int i=0;i<n;i++) {
			int b=sc.nextInt();
			int s=sc.nextInt();
			int c=sc.nextInt();
			int mb,ms,mc;
		mb=c-s;
		ms=c-b;
		mc=mb+ms;
		fp[i]=c-mc;
	}
		for(int j=0;j<n;j++)
		System.out.println(fp[j]);
		sc.close();
	}

}
