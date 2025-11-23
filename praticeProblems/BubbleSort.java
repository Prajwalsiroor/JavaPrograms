package praticeProblems;
import java.util.Scanner;
public class BubbleSort{
	public static int[] bubbleSort(int[] arr){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			boolean flag=true; // Arrays are Sorted
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				 	flag=false;
				}
			}
		}	
		return arr;
	}
	public static void print(int[] arr){
	   for(int i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+" ");
	    }
	   System.out.println();
	}
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Size Array Elements:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.print("Enter the Array Elements:");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();	
     }
    System.out.print("The Array Before Sorted:");
    print(arr);
    bubbleSort(arr);
    System.out.print("The Array After Bubble Sort and the Sorted Array is:");
    print(arr);
    sc.close();
	}
}
