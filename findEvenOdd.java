package palakmadam;
import java.util.*;
public class findEvenOdd {
	
	public static void evenodd (int x )
	{
		if (x%2 == 0)
		
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter two number : ");
		Scanner sc = new Scanner (System.in);
		
		int num1=sc.nextInt();
		
		evenodd(num1);
		
		sc.close();
		
	}

}
