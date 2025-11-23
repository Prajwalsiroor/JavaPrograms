package stringAndStringBuider;
import java.util.Scanner;
public class CountVowelsInString{
	public static boolean isVowel(char ch){
		if(ch=='a'|| ch=='A') return true;
		else if(ch=='e'|| ch=='E') return true;
		else if(ch=='i'|| ch=='I') return true;
		else if(ch=='o'|| ch=='O') return true;
		else if(ch=='u'|| ch=='U') return true;
		else return false;
	}
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the String: ");
    String str=sc.nextLine();
    int countVowel=0;
    int consonants=0;
    for(int i=0;i<str.length();i++){
    	char ch=str.charAt(i);
    	if(isVowel(ch)==true) countVowel++;
    	else consonants++;
    }
    System.out.print("The Vowel in the String are: "+countVowel+" and Consonants are: "+consonants);
    sc.close();
	}

}
