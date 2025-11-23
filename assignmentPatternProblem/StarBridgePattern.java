package assignmentPatternProblem;
public class StarBridgePattern{
	public static void main(String[] args){
	int n=4;
	for(int i=1;i<=n;i++){
       for(int j=1;j<=n-i+1;j++){
    	   System.out.print("x"+" ");
       }
       for(int j=1;j<=n-1;j++){
    	   System.out.print("x"+" ");
       }
       System.out.println();
	 }
	}
}