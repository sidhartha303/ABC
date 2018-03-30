
public class InsertionSort {
	
	static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0 &&temp<arr[j-1]) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
	}

	public static void main(String[] args) {

		int arr[]= {223,554,6,88,12,9,0};
		sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}