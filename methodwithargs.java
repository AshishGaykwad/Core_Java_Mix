package palakmadam;
import java.util.*;
public class methodwithargs {
	void multi(int a , int b)
	{
		int result = a * b;
		System.out.println("multiplication is "+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter two number for multiplication:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		methodwithargs obj = new methodwithargs();
		obj.multi(x, y);
		sc.close();
	}

}
