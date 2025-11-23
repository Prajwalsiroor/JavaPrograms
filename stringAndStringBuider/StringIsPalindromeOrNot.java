package stringAndStringBuider;
import java.util.Scanner;
public class StringIsPalindromeOrNot{
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String to Check Palindrome:");	
	String str=sc.nextLine();
	String result="";
	for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        result=result+ch;
	 }
	if((str.equals(result))){
	   System.out.print("Given String "+str+" is Palindrome");	
	}
	else System.out.print("Given String is Not Palindrome");
	sc.close();
	}
}