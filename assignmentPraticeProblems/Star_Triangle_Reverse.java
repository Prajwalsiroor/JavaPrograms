package assignmentPraticeProblems;
public class Star_Triangle_Reverse{
    public static void main(String[] args){
	int n=5;
	for(int i=1;i<=n;i++){
       for(int j=1;j<=(n-i+1);j++){
    	   System.out.print("*"+" ");
       }
       System.out.println();
	 }
	System.out.println();
	for(int i=1;i<=n;i++){
	    for(int j=1;j<=(n-i+1);j++){
	    	System.out.print(j+" ");
	     }
	  System.out.println();
	  }
	System.out.println();
	char ch='A';
	for(int i=1;i<=n;i++){
	  for(int j=1;j<=(n-i+1);j++){
	     System.out.print(ch+" ");
	     }
	    ch++;
	   System.out.println();
	  }
	}
}