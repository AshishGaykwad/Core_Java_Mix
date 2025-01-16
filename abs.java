package abstraction;

abstract class Demo4
{
	abstract void show();
	
	void m1()
	{
		System.out.println("in m1 method");
	}
}
public class abs extends Demo4{
	
		void show()
		{
			System.out.println("implemented show");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abs a = new abs();
		a.m1();
		a.show();
	}

	
	

}
