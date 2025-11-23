package arraysPackage;
public class PairsInArrays{
    public static void ArrayPairs(int[] arr){
    int countPair=0;
     for(int i=0;i<arr.length;i++){
    	  for(int j=i+1;j<arr.length;j++){
    		  System.out.print("{"+arr[i]+","+arr[j]+"}");
    		  countPair++;
    	  }
    	  System.out.println();
      }
     System.out.print("The Total Number Pair Count is:"+countPair);
  }
  public static void main(String[] args){
	int[] array= {2,4,6,8,10};
    ArrayPairs(array);
	}
}