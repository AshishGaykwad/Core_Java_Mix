package ExceptionHandling;

public class finallysecondex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 7, 1, 8, 5, 7 };

		try
		{
			System.out.println(a[10]);
		}
		catch (ArithmeticException e)
		{
			System.out.println(a[2]/0);
			System.out.println("index is out of bound");
		}
		finally
		{
			System.out.println("existing..");
		}
	}

}
