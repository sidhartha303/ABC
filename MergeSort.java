
public class MergeSort {

	public static void divide(int[] A) {
		int n=A.length;
		if(n<2)
			return;
		else {
			int mid=n/2;
			int[] left= new int[mid];
			int[] right= new int[n-mid];
			for(int i=0;i<=mid-1;i++) {
				left[i]=A[i];
			}
			for(int i=mid;i<=n-1;i++) {
				right[i-mid]=A[i];
			}
			divide(left);
			divide(right);
			merge(left,right,A);
		}
	}
	
	public static void merge(int L[], int R[], int A[]) {
		
		int nL=L.length;
		int nR=R.length;
		int i=0,j=0,k=0;
		
		while(i<nL && j<nR) {
			if(L[i]<=R[j]) {
				A[k]=L[i];
				i=i+1;
			}
			else {
				A[k]=R[j];
				j=j+1;
			}
			k=k+1;
		}
		while(i<nL) {
			A[k]=L[i];
			i=i+1;
			k=k+1;
		}
		while(j<nR) {
			A[k]=R[j];
			j=j+1;
			k=k+1;
		}
	}
	public static void main(String[] args) {
		int a[]= {11,10,9,8,7,6,5,4,3,2,1,0};
		long startTime=System.nanoTime();
		divide(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		long endTime=System.nanoTime();
		System.out.println("\nTook "+(endTime - startTime) + " ns");
	}
}