//package multithreading;
//
//class A3 implements Runnable
//{
//	public void run ()
//	{
//		System.out.println(Thread.currentThread().getName() + " t1: "+Thread.currentThread().getPriority());
//		
//		for (int i = 0; i < 5; i++)
//		{
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//}
// class priority
//{
//
//	public static void main(String[] args)
//	{
//		
//		A3 ob = new A3();
//		Thread t1 = new Thread(ob);
//		t1.setPriority(2);
//		t1.start();
//		
//		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
//
//	}
//
//}



package multithreading;

class A3 implements Runnable
{
	public void run ()
	{
		System.out.println(Thread.currentThread().getName() + " t1: "+Thread.currentThread().getPriority());
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
 class priority
{

	public static void main(String[] args)
	{
		
		A3 ob = new A3();
		Thread t1 = new Thread(ob);
		t1.setName("T1");
		System.out.println(t1.getName()+" "+t1.isDaemon());
		t1.setDaemon(true);
		t1.setPriority(2);
		t1.start();
										
		System.out.println(t1.getName()+" "+t1.isDaemon());
		System.out.println(Thread.currentThread().isDaemon());
		
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());

	}

}
