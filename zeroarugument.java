package oops;
class A
{
	void m1 ()
	{
		System.out.println("hii from m1");
	}
	A()
	{
		System.out.println("hi form constructor A");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("hi from m2");
	}
	B()
	{
		System.out.println("hi from constructor B");
	}
}

public class zeroarugument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.m1();
		obj.m2();
		
		
		
	}

}
