package stringAndStringBuider;
import java.util.Scanner;
public class StringAppend{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String1:");
    StringBuilder str1=new StringBuilder(sc.nextLine());
	System.out.print("Enter the String2:");
    StringBuilder str2=new StringBuilder(sc.nextLine());
    System.out.print("The Appended String is:");
    System.out.println(str1.append(" ").append(str2));
    sc.close();
	}
}