package assignmentPraticeProblems;
public class Odd_Number_Triangle{
	public static void main(String[] args){
	int n=5;
	for(int i=1;i<=n;i++){
	  int num=1;
      for(int j=1;j<=i;j++){
    	  System.out.print((num)+" ");
    	  num=num+2;
       }
       System.out.println();
	}
	System.out.println();
	int num=1;
	for(int i=1;i<=n;i++){
	    for(int j=1;j<=i;j++){
	     System.out.print((num++)+" ");
	    }
	   System.out.println();
	  }
	}
}