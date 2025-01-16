package ExceptionHandling;

public class finallykey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {3,7,1,8,5,7};
		
		try
		{
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index out of bounds...");
		}
		finally
		{
			System.out.println("existing..");
		}
	}

}
