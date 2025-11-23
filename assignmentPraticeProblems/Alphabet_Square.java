package assignmentPraticeProblems;
public class Alphabet_Square{
	public static void main(String[] args){
	int n=5;
	for(int i=1;i<=n;i++){
		char ch='A';
		for(int j=1;j<=n;j++){
			System.out.print((ch++)+" ");
		}
		System.out.println();
	  }
	System.out.println();
	char temp='A';
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
	      System.out.print(temp+" ");		
		}
		temp++;
		System.out.println();
	  }
	}
}