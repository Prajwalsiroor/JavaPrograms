package stringAndStringBuider;
import java.util.Scanner;
public class ToggleAllCharacterInStrings{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String:");
	StringBuilder str=new StringBuilder(sc.nextLine());
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        int ascii=(int)ch;
        if(ascii>=65 && ascii<=90){
           ascii+=32;
           ch=(char)ascii;
           str.setCharAt(i,ch);
         }
        else if(ascii>=97 && ascii<=122){
        	ascii-=32;
        	ch=(char)ascii;
	        str.setCharAt(i,ch);
        }
      }
    System.out.print("The Resultant String is: "+str);
    sc.close();
	}
}