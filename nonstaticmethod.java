package palakmadam;

public class nonstaticmethod {
	void sum()
	{
		int num1 = 2;
		int num2 = 4;
		int result = num1+num2;
		System.out.println(result);
	}
	void display()
	{
		System.out.println("Hello world");
	}
	void sub()
	{
		int num1 = 2;
		int num2 = 4;
		int result = num1-num2;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonstaticmethod obj = new nonstaticmethod();
		obj.sum();
		obj.display();
		obj.sub();
	}

}
