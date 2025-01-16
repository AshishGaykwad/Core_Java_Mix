package abstraction;



public class Demomain extends Demo{
	
	
	void show()
	{
		System.out.println("hello child class");
	}
	void m1()
	{
		System.out.println("redefining");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demomain demo = new Demomain();
		demo.show();
		demo.m1();
		
	}

}
