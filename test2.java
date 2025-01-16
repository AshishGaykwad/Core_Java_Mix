package abstraction;

interface InterfaceDemo
{
	void m1();
	default void m2()
	{
		System.out.println("default method");
	}
	static void m3()
	{
		System.out.println("default method");
	}
}

class A implements InterfaceDemo
{

	@Override
	public void m1()
	{
		// TODO Auto-generated method stub
		System.out.println("A class in m1 method");
		
	}
	public void m2()
	{
		System.out.println("A class in m2 method");
	}
	
}
	class B implements InterfaceDemo
		
	{
		
		@Override
		public void m1()
		{
			// TODO Auto-generated method stub
			
			System.out.println("B class in m1 method");
		}
	
	
}


public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.m1();
		a.m2();
		
		 B b = new B();
		 b.m1();
		 b.m2();
		
		
		
		
	}

}


