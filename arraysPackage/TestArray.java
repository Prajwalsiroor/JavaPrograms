package arraysPackage;
import java.util.Scanner;
public class TestArray{
	public static void main(String[] args){
    System.out.print("Enter the Size of the Array:");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.print("Enter Elements in the Array:");
    for(int i=0;i<size;i++){
    	 arr[i]=sc.nextInt();
     }
    for(int ele:arr){
    	System.out.print(ele+" ");
     }
    sc.close();
	}
}
