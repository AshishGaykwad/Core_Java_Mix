package ExceptionHandling;

public class qu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		
		int result = 0;
		try
		{
			
			System.out.println("statement 1");
			result = num / 0;
			System.out.println("statement 3");
		}
		catch (ArithmeticException e)
		
		{
			System.out.println("statement 4");
			System.out.println("infinite");
			System.out.println("statement 6");
		}
		System.out.println(result);
		System.out.println("statement 8");
	}

}
