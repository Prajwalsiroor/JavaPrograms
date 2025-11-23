package speciaPattern;
public class CharacterPatternPrint{
	public static void main(String[] args){
    char ch='A';
    int n=6;
	for(int i=1;i<=n;i++){
	  	for(int j=0;j<i;j++){
	  		System.out.print(ch++);
	  	}
	  	System.out.println();
	  }
	}
}