package ExceptionHandling;

public class tryWithMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1=22;
		String name = null;
		int result = 0;
		
		try
		{
			System.out.println("statement 1");
			result = num1/0;
			System.out.println(name.length());
			System.out.println("statement 3");
		}
		catch (ArithmeticException e)
		{
			System.out.println("statement 4");
			System.out.println("infinite...");
			System.out.println("statement 6");
		}
		catch(NullPointerException e)
		{
			System.out.println("give a name...");
		} 
		catch (Exception e)
		{
			
		}
	}

}
