package sortingAlogrithms;
public class BubbleSortAlgo{
	public static void main(String[] args){
    int arr[]= {1,4,3,2,5};
    for(int i=0;i<arr.length-1;i++){
       boolean flag=true;// Array Sorted
       for(int j=0;j<arr.length-i-1;j++){
    	   if(arr[j]>arr[j+1]){
              int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  flag=false;
    	   }
        }
       if(flag==true) break;
      }
     for(int ele:arr){
    	 System.out.print(ele+" ");
     }
	}
}