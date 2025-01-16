package abstraction;

interface I1
{
	void m1();
	void m2();
}

public class mainClass implements I1{

	public void m1()
	{
		System.out.println("in m1 mthod");
	}
	
	public void m2()
	{
		System.out.println("in m2 method");
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		mainClass ob = new mainClass();
		
		ob.m1();
		ob.m2();
	}

}
