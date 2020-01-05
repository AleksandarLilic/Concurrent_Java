import java.util.Scanner;

public class Strings 
{
	static boolean palindrome(String t)
	{
		StringBuffer s = new StringBuffer(t);
		s.reverse();
		String s1 = new String (s);
		boolean test = false;
		test = s1.equalsIgnoreCase(t);
		return test;		
	}
	
	public static void main(String[] args)
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Word to test: ");
		String s = scan1.next();
		System.out.println("Input word is: " + s);
		boolean test = palindrome(s);
		System.out.println("Word is palindrome: " + test);		
	}
}
