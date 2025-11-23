package speciaPattern;
public class MiroorImageTrianglePatternPrint{
	public static void main(String[] args){
		int n=10;
		int increment=0;
		//First Half Miroor
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(i);j++){
				System.out.print(" ");
			}
			for(int j=1;j<=(n-i+1);j++){
				System.out.print((increment+j)+" ");
			}
			increment++;
			System.out.println();
		}
	  //Second Half Miroor
	   	}
}