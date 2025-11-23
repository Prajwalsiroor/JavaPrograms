package sortingAlogrithms;
import java.util.ArrayList;
public class MoveZeroAtEnd{
	public static void print(int[] arr){
    for(int ele:arr) {
       System.out.print(ele+" ");	
     }
     System.out.println();
	}
	public static void main(String[] args){
	int[] arr={1,0,2,0,5,0,3,4};
    ArrayList<Integer> list=new ArrayList<>();
    int noz=0;
    print(arr);
    for(int ele:arr) {
       if(ele!=0) list.add(ele);
       else noz++;
     }
    for(int i=0;i<noz;i++){
    	list.add(0);
    }
    for(int i=0;i<arr.length;i++) {
    	arr[i]=list.get(i);
    }
    print(arr);
	}
}