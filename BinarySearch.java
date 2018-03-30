class BinarySearch{
	
	public static int search(int arr[],int min,int max,int x) {
		int guess=(max-min)/2;
		if(max<min) {
			return -1;
		}
		else {
			if(arr[guess]==x)
				return guess;
			else if(arr[guess]<x)
				min=guess+1;
			else
				max=guess-1;
		}
		return guess;
	}

   public static void main(String args[]){
     
	   int arr[]= {1,2,3,4,5,6,7,8,9};
	   int n=arr.length;
	   int min=0, max=n-1;;
	   int x=5;
	   int target=search( arr,min,max,x);
	   if(target==-1)
		   System.out.println("Element not present");
	   else
		   System.out.println("Element present at:"+target);
	   
}}