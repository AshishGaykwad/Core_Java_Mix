package ExceptionHandling;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int  num1 = 45;
		int num2=0;
		
		try {
			
			int result =  num1/num2;
			System.out.println(result);
		}
		catch (ArithmeticException e)
		{
			
			System.out.println("infinite...");
		}
		
	}

}
