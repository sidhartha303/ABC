package algorithm;

import java.util.Scanner;

public class TrainTicket {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String b = null;
		int i;
		
		
		if(n>=1 && n<=72) {
			i=n%8;

			if(i==1 || i==4)
					b="LB";
				else if(i==2 || i==5) {
					b="MB";
				}
				else if(i==3 || i==6) {
					b="UB";
				}
				else if(i==7) {
					b="SLB";
				}
				else {
					b="SUB";
				}
			System.out.println(b);
			}
			
		else
			System.out.println("Invalid");
		
		
		sc.close();
	}
}
