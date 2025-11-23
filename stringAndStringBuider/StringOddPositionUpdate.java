package stringAndStringBuider;
import java.util.Scanner;
public class StringOddPositionUpdate{
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the String:");
    String str=sc.nextLine();
    String result="";
    for(int i=0;i<str.length();i++){
       char ch=str.charAt(i);
       if(i%2!=0 && ch!=' '){
    	   result=result+"#";
       }
       else result=result+ch;
     }
    System.out.print("The Resultant Odd String Modification of # is: "+result);
    sc.close();
	}
}