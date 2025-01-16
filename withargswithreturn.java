package palakmadam;
import java.util.*;
public class withargswithreturn {
	int add (int x, int y)
	{
		int z = x + y;
		return z;
	}
	int sub (int x , int y)
	{
		int z = x - y;
		return z;
	}
	int multi (int x , int y)
	{
		int z = x * y;
		return z;
	}
	int div (int x , int y)
	{
		int z = x / y;
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter two number ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		withargswithreturn obj = new withargswithreturn();
		
		int add = obj.add(a,b);
		System.out.println(add);
		
		int sub = obj.sub(a, b);
		System.out.println(sub);
		
		int multi = obj.multi(a, b);
		System.out.println(multi);
		
		int div = obj.div(a, b);
		System.out.println(div);
		sc.close();
	}

}
