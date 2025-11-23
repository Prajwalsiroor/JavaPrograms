package assignmentPraticeProblems;
public class NumberAndCharacter{
	public static void main(String[] args){
    int n=10;
    for(int i=1;i<=n;i++){
      if((i%2)!=0){
    	 for(int j=1;j<=i;j++){
    		 System.out.print(j+" ");
    	 }
      }
      else{
    	  for(int j=1;j<=i;j++){
    		  System.out.print((char)(j+64)+" ");
    	  }
       }
      System.out.println();
     }
   }
}