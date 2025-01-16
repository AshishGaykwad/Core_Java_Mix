package multithreading;

class TestThread2 extends Thread
{
	public void run()
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class two_thread_2
{

	public static void main(String[] args)
	{
		TestThread2 t1 = new TestThread2();
		
		t1.start();
		
		for (int i = 1; i < 10; i++)
		{
			try
			{
				Thread.sleep(1200);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		
		

	}

}
