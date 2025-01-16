package oops;

class X
{
	int num1=76;
	int num2=99;
	
	void m1()
	{
		System.out.println("hii from m1()");
	}
	static void m2()
	{
		System.out.println("hii from m2()");
	}
	X (int n)
	{
		System.out.println("x-one args constructor");
	}
}
	class Y extends X 
	{
		int num3 = 32;
		Y(int n)
		{
			super(n);
			System.out.println("y - one args constructor");
		}
	}

public class zeroargument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y ob = new Y (12);
		System.out.println(ob.num1);
		System.out.println(ob.num2);
		System.out.println(ob.num3);
		ob.m1();
		Y.m2();
	}

}
