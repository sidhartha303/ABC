
public class Binary {
	static int a[]=new int[10];
	static int i=0;
	static void bin(int n) {
		int r=0;
		while(n>0) {
			r=n%2;
			n=n/2;
			a[i]=r;
			i++;
		}	
	}
	
	public static void main(String[] args) {

		bin(12);
		System.out.print(0);
		for(int j=i-1;j>=0;j--) {
			System.out.print(a[j]);
		}
}}

	 