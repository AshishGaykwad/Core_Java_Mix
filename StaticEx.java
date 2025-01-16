package palakmadam;
import java.util.*;
public class StaticEx {
	
	public static void sum (int num1,int num2)
	{
		int z=num1+num2;
		
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sum(x , y);
		sc.close();
	}

}
