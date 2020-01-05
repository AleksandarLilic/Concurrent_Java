import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args)
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("First number: ");
		String s1 = scan1.next();
		System.out.println("Second number: ");
		String s2 = scan1.next();	
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		System.out.println("Integers: " + x + " " + y);
		
		try 
		{
			System.out.println("Division result: x/y = " + x/y); 
			System.out.println("End of try block");
		} 
		
		catch(ArithmeticException e) { 
			System.out.println("Error. Division by zero not possible.");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}		
		System.out.println("End of block");		
	}
}