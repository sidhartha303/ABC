
public class Bin2Dec {

	public static void main(String[] args) {

		int n=111001101;
		dec(n);		
	}

	public static void dec(int n) {
		int r,i=0,v=0;
		int a[]=new int[10];
		while(n>0) {
			r=n%10;
			a[i]=r;
			n=n/10;
			i++;
		}
		
		for(int j=0;j<a.length;j++) {
			v=(int) (v+(a[j]*Math.pow(2, j)));
		}
		System.out.println(v);
	}
		
	}
