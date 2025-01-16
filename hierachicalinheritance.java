package palakmadam;

class A5
{
	void m1()
	{
		System.out.println("class A method m1");
	}
	void m2()
	{
		System.out.println("class A method m2");
	}
}
class  B5 extends A5
{
	void Bm1()
	{
		System.out.println("class B method bm1");
	}
}
class C  extends A5
{
	void Cm1()
	{
		System.out.println("class c method cm1");
	}
}

public class hierachicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B5 b = new B5();
		b.m1();
		b.m2();
		b.Bm1();
		
		C c = new C();
		c.m1();
		c.m2();
		c.Cm1();
		
	}

}
