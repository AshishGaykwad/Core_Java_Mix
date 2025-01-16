package oops;

class X1
{
	int num1 = 76;
	int num2 = 99;
	void m1()
	{
		System.out.println("hii form x - m1()");
	}
	static void m2()
	{
		System.out.println("hi from x - m2()");
	}
	X1()
	{
		System.out.println("x-zero args constructor");
	}
}
	class Y1 extends X1
	{
	int  num3 = 32;
	Y1()
	{
		System.out.println("Y args constructor");
	}
	void M()
	{
		System.out.println("Y in child class method");
	}
}
class T1 extends Y1
{
	
}

public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t = new T1();
		t.M();
		X1.m2();
		t.m1();
		
		

	}

}
