package multithreading;

class A1 implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("b");
		}
	}
	
}


class A2 implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("a");
		}
	}

}

public class Implements
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A1 ob = new A1();
	
		Thread t1 = new Thread(ob);
		t1.start();
		
		A2 obj = new A2();
		obj.run();
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}

}
