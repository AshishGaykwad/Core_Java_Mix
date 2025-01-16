package palakmadam;
import java.util.*;
public class ArithmaticOperation {
	
	public static void add (int x , int y)
	{
		int z = x+y;
		System.out.println(z);
	}
	public static void sub (int x , int y)
	{
		int z = x-y;
		System.out.println(z);
	}
	public static void multi (int x , int y)
	{
		int z = x*y;
		System.out.println(z);
	}
	public static void div (int x , int y)
	{
		int z = x/y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter two number : ");
		Scanner sc = new Scanner (System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		add(num1,num2);
		sub(num1,num2);
		multi(num1,num2);
		div(num1,num2);
		sc.close();
	}

}
