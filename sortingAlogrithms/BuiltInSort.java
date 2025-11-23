package sortingAlogrithms;
import java.util.Arrays;
public class BuiltInSort{
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr={7,6,5,2,-4,-1,3};
	    print(arr);
        Arrays.sort(arr);
        print(arr);
	}
}