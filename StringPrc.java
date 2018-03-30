import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringPrc {
	
static int birthdayCakeCandles(int n, double[] arr) {
        int x=1;;
        Arrays.sort(arr);
		
	for(int i=n-1;i>0;i--) {
		if(arr[(n-1)]==arr[(i-1)])
			x++;
		else
			return x;
	}
	return x;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
    	int n=scan.nextInt();
    	double[] ar = new double[n];
    	
    	for(int i=0;i<n;i++) {
    		ar[i]=scan.nextInt();
    	}
    	
    	int result=birthdayCakeCandles(n, ar);
    	System.out.println(result);
    	scan.close();
    }
}
