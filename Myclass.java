package palakmadam;

//class A
//{
//A()
//{
//	System.out.println("a class cons");
//}
//}
//
//class B extends A
//{
//
//}
//public class Myclass {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		A a = new A();
//		B b = new B();
//	}
//
//}


 class A
{
	 int x;
A(int var)
{
	x = var;
	System.out.println("a class cons");
}
}

class B extends A
{
	B()
	{
	super(4);
}
}
public class Myclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A();
		B b = new B();
	}

}