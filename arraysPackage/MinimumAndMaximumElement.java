package arraysPackage;
public class MinimumAndMaximumElement{
	public static void main(String[] args){
     int[] arr={1,2,3,4,5};
     int minele=Integer.MAX_VALUE;
     int maxele=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++){
    	 if(arr[i]<minele) {
    		 minele=arr[i];
    	 }
     }
     for(int i=0;i<arr.length;i++){
    	 if(arr[i]>minele) {
    		 maxele=arr[i];
    	 }
     }
     System.out.println("The Minimum Element:"+minele);
     System.out.print("The Maximum Element:"+maxele);
	}
}