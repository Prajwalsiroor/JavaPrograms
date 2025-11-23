package stringAndStringBuider;
public class LowerCaseAndUpperCaseInString{
	public static void main(String[] args){
    String str1="Hello";
    String str2="World";
    System.out.println(str1.equals(str2));
    System.out.println(str1.toLowerCase());
    System.out.println(str2.toUpperCase());
    System.out.println(str1.compareTo(str2));
    System.out.println(str1.concat(str2));
    System.out.println(str1.concat(" ").concat(str2));
	}
}