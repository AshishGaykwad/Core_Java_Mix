package palakmadam;
import java.util.*;
public class withreturn {
	
	int sum()
	{
		int num1 = 2 , num2 = 2;
		int result = num1 + num2;
		return result;
	}
	int sum (int num1 , int num2)
	{
		int result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter two number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		withreturn obj = new withreturn();
		int z = obj.sum(x,y);
		System.out.println(z);
		int s = obj.sum();
		System.out.println(s);
		sc.close();
	}

}
