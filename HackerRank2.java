package string;

import java.util.Scanner;

public class HackerRank2 {

	public static void main(String[] args) {
		int i=0;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String ss[]=new String[input];
        for(i=0;i<input;i++) {
         ss[i] = sc.next();        
	}
        oddeven(ss);
        sc.close();
  }
	
	 static void oddeven(String[] ss) {
		
		 String odd="";
		 String even="";
		 for(int i=0;i<ss.length;i++) {
			 char[] ch=ss[i].toCharArray();
			 for(int j=0;j<ch.length;j++) {
			 if(j%2==0) {
				 even=even+ch[j];
			 }
			 else if(j%2 !=0)
				 odd=odd+ch[j];
		 }
			 System.out.println(even+" "+odd);
			 odd="";
			 even="";
			 }
	}
	 }