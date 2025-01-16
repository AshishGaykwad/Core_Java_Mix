package multithreading;

class TestThread extends Thread
{
	public void run ()   // running
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("child thread");
		}
	}
	//dead state
}

public class First {

	public static void main(String[] args)
	{
		TestThread t1 = new TestThread(); // new
		
		
		t1.start();  // ready

	}

}
