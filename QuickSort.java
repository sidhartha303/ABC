
public class QuickSort {

	static void sort(int arr[],int low,int high) {
		
		int i=low, j=high, temp, pivot=arr[low];
		while(i<=j) {
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
				
			if(i<=j) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j) {
			sort(arr,low,j);
		}
		if(i<high) {
			sort(arr,i,high);
		}
	}
	public static void main(String[] args) {
		int arr[]= {12,3,76,331,5,0,67,1};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}