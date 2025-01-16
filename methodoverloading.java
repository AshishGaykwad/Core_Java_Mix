package palakmadam;

public class methodoverloading {
	
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		methodoverloading m = new methodoverloading();
		m.sum(25, 25);;
		m.sum(10, 20, 30);

	}

}
