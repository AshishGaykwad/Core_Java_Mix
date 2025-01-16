package multithreading;

class pale extends Thread
{
	public void run ()
	{
		int n = 15;
		int a = 0;
		int b = 1;
		
		System.out.println("next pale number "+a);
		System.out.println("next pale number "+b);
		
		for (int i=3; i<=n; i++)
		{
			int c = a+b*2;
			System.out.println("next pale number "+c);
			a=b;
			b=c;
			
		}
	}
}

class fibo extends Thread
{
	public void run()
	{
		int n = 10;
		int a = 0; 
		int b = 1;
		
		System.out.println("next pale number "+a);
		System.out.println("next pale number "+b);
		
		for(int i = 3; i<=n ; i++)
		{
			int c = a + b;
			System.out.println("next fibo number "+ c);
			a=b;
			b=c;
		}
	}
}

public class fibo_thread_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		pale p1 = new pale ();
		p1.start();
		
		fibo f1 = new fibo();
		f1.start();
	}

}
