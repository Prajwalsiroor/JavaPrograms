package stringAndStringBuider;
public class StringIsAnagramOrNot{
	public static boolean isAnagram(char[] ch1,char[] ch2){
		for(int i=0;i<ch1.length;i++){
	        if(ch1[i]!=ch2[i]){
	        	return false;
	        }
	     }
		return true;
	}
	public static char[] sortCharacter(char[] ch){
	for(int i=0;i<ch.length-1;i++){
	   for(int j=i+1;j>=1;j--){
		   if(ch[j]<=ch[j-1]){
			   char temp=ch[j];
			   ch[j]=ch[j-1];
			   ch[j-1]=temp;
		   }
		   else break;
	   }
	 }
	return ch;
	}
	public static void main(String[] args){
    String s1="abc";
    String s2="aba";
    char[] ch1=s1.toCharArray();
    char[] ch2=s2.toCharArray();
    sortCharacter(ch1);
    sortCharacter(ch2);
    System.out.println("The Given two String is Valid Anagram or Not: "+isAnagram(ch1,ch2));
    }
}