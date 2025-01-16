package ExceptionHandling;

public class arrayoutfobound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]= {1,2,3,4,5};
		
		try 
		{
			System.out.println(a[9]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index out of bound exception");
		}
	}

}
