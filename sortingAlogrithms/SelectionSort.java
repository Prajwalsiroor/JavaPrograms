package sortingAlogrithms;
public class SelectionSort{
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	int[] arr={7,6,5,2,-4,-1,3};
    int n=arr.length;
    print(arr);
    for(int i=0;i<n-1;i++){
       int minEle=Integer.MIN_VALUE;
       int minIndex=-1;
       for(int j=i;j<n;j++){
    	   if(arr[j]>minEle){
    		   minEle=arr[j];
    		   minIndex=j;
    	   }
       }
       int temp=arr[minIndex];
       arr[minIndex]=arr[i];
       arr[i]=temp;
      }
    print(arr);
	}
}
