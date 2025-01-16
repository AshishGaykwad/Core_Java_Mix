package Akshaysir;
import java.util.*;
public class simplecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter operator");
		char opr = sc.next().charAt(0);
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		if (opr == '+')
		{
			System.out.println("Add is : "+ (a+b) );
			
		}
		else if (opr=='-')
		{
			System.out.println("sub is : "+ (a-b));
		}
		else if (opr == '*')
		{
			System.out.println("multi is : " + (a*b));
		}
		else if (opr == '/')
		{
			System.out.println("div is : " + (a/b));
		}
		else 
		{
			System.out.println("invalid operator");
		}
		sc.close();
	}

}
