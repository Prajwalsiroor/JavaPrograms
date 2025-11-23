package assignmentPraticeProblems;
public class Number_And_Alphabet{
	public static void main(String[] args){
	int n=6;
	for(int i=1;i<=n;i++){
	   if(i%2!=0){
         for(int j=1;j<=i;j++){
    	    System.out.print(j+" ");
         }
	  }
      else{
    	  char ch='A';
          for(int j=1;j<=i;j++){
        	System.out.print((ch++)+" ");  
           }
         }
       System.out.println();
	   }
	 }
}