package palakmadam;

class Test1
{
	void displayNum(int x)
	{
		System.out.println(x);
	}
	void displayNum(int x,int y)
	{
		displayNum(x);
		System.out.println(x+" "+y);
	}
	void displayNum(int x,int y,int z)
	{
		displayNum(x,y);
		System.out.println(x+" "+y+" "+z);
	}
}

public class methodover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		t1.displayNum(2,20,10);
	}

}
