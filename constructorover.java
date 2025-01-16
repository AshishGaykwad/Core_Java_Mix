package palakmadam;

class test2
{
	int x;
	test2 ()
	{
		System.out.println(x);
	}
	test2 (int x)
	{
		this.x = x;
		System.out.println(x);
	}
	test2 (int x, int y)
	{
		this.x =x;
		System.out.println(x+" "+y+" ");
	}
}

public class constructorover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 t = new test2();
		test2 t1 = new test2(10);
		test2 t2 = new test2(5,20);
	}

}
