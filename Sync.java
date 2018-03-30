package thread;

import java.util.Arrays;

public class Sync extends Thread {
	static Integer s[]= {2,4,6,3,7,9,8,1,5};
	
	public static void main(String[] args) {
		
		//Arrays.sort(s);
		Sync s1=new Sync() {
			public void run() {
				for(int i=0;i<s.length;i++) {
					if(s[i]%2==0)
						System.out.println("Even-"+s[i]);
					try {
						Thread.sleep(1000);;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Sync s2=new Sync() {
			public void run() {
				for(int i=0;i<s.length;i++) {
					if(s[i]%2!=0)
						System.out.println("Odd-"+s[i]);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		s1.start();
		s2.start();
	}
}