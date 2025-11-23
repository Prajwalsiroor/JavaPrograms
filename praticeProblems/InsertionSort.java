package praticeProblems;
public class InsertionSort{
	public static void print(int[] arr){
		   for(int i=0;i<arr.length;i++) {
			  System.out.print(arr[i]+" ");
		    }
		   System.out.println();
	}
	public static void main(String[] args){
	    int[] arr={7,6,25,122,-4,-17,3};
	    int n=arr.length;
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
        print(arr);
	}
}