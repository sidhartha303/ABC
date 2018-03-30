package daysofcode;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        String n=scan.nextLine();
        String d1=scan.nextLine();
        String s1=scan.nextLine();
        
        double d2=Double.valueOf(d1);
        int m=Integer.valueOf(n);
        System.out.println(i+m);
        System.out.println(d+d2);
        System.out.println(s+s1);
        
	}

}
