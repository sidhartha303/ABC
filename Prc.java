import java.util.Arrays;
import java.util.Scanner;

public class Prc {

	static void miniMaxSum(int[] arr) {
        long s=0;
        int k=0,m=0;
        long a[]=new long[arr.length];
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr.length;j++) {
    			s=s+arr[m];
    			m++;
   		    }
    		s=s-arr[i];
    		a[k]= s;
			++k;
			s=0;
			m=0;
    	}
    	
    	Arrays.sort(a);
    		System.out.println(a[0]+" "+a[a.length-1]);
    		
    }    
    	
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < arrItems.length; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
