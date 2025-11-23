package speciaPattern;
public class Inverted_Triangle {
	public static void main(String[] args) {
    int n=7;
    for(int i=1;i<=n;i++){
      for(int j=n;j>=i;j--){
    	  System.out.print("*");
       }
      System.out.println();
     }
	}
}