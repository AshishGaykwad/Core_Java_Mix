package Akshaysir;

public class findUpperLowerSymbol {

	public static void main (String args[])
	{
		char ch = 'B';
		
		if (ch>='A' && ch<='Z')
		{
		System.out.println("uppercase");	
		}
		else if (ch >='a' && ch<='z')
		{
			System.out.println("lowercase");
		}
		else if (ch>='1' && ch<='9')
		{
			System.out.println("number");
		}
		else 
		{
			System.out.println("special character");
		}
	}
}
