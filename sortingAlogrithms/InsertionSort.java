package sortingAlogrithms;
public class InsertionSort{
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int[] arr={7,6,5,2,-1,-2,-3};
        int n=arr.length;
        System.out.print("Unsorted Array:");
        print(arr);
        for(int i=0;i<n-1;i++){
        	for(int j=i+1;j>=1;j--){
        		if(arr[j]<arr[j-1]){
	        		int temp=arr[j];
	        		arr[j]=arr[j-1];
	        		arr[j-1]=temp;
        	   }
        		else break;
           }
        }
      System.out.print("Sorted Array: ");
      print(arr);
	}
}