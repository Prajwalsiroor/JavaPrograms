package assignmentPatternProblem;
public class RhombusPattern{
	public static void main(String[] args){
    int n=5;
    System.out.println("The Rhombus Pattern Print:");
    for(int i=1;i<=n;i++){
       for(int j=1;j<=n-i;j++){
    	   System.out.print(" "+" ");
       }
       for(int j=1;j<=n;j++){
    	   System.out.print("X"+" ");
       }
       System.out.println();
      }
	}
}