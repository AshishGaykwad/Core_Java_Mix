package Akshaysir;

public class nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=30;
		int num2=20;
		int num3=10;
		
		if (num1>num2 && num1>num3)
		{
			System.out.println("num1 is max");
			
			if (num2<num3)
			{
				System.out.println("num2 is min");
			}
			else 
			{
				System.out.println("num3 is min");
			}
		}
		else if (num2>num1&&num2>num3)
		{
			System.out.println("num2 is max");
			if (num1<num3)
			{
				System.out.println("num1 is min");
			}
			else
			{
				System.out.println("num3 is min");
			}
		}
		else
		{
			System.out.println("num3 is max");
			if (num1<num2)
			{
				System.out.println("num1 is min");
			}
			else
			{
				System.out.println("num2 is min");
			}
		}
	}

}
