package stringAndStringBuider;
public class SubStringInString{
	public static void main(String[] args){
    String str="abcde";
    int n=str.length();
    for(int i=0;i<n;i++){
      	for(int j=i+1;j<=n;j++){
      		System.out.print(str.substring(i,j)+" ");
      	}
      	System.out.println();
     }
    System.out.println();
    for(int i=0;i<n;i++){
    	System.out.print(str.substring(i)+" ");
     }
    System.out.println();
	}
}