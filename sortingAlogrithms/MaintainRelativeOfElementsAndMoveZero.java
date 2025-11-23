package sortingAlogrithms;
public class MaintainRelativeOfElementsAndMoveZero{
	public static void main(String[] args){
		int[] arr= {0,1,0,2,0,3,0,8,0,0,5};
		int n=arr.length;
		int noOfZero=0;
		System.out.print("Zero are not Moved at End:");
		for(int ele:arr){
			System.out.print(ele+" ");
		}
		System.out.println();
		for(int ele:arr){
			if(ele==0) noOfZero++;
		}
		for(int i=0;i<noOfZero;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]==0){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("Zero Are Moved at End:    ");
	    for(int ele:arr){
    	   System.out.print(ele+" ");
       }
	}
}