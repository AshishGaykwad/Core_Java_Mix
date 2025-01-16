package palakmadam;



public class methodoverloadingexample {
	
	void sum(int num1,int num2,int num3)
	{
		System.out.println(num1+num2+num3);
	}
	void sum(float num1,float num2)
	{
		System.out.println(num1+num2);
	}
	void sum(String s1,String s2)
	{
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloadingexample t1 = new methodoverloadingexample();
		
		t1.sum(10, 20, 30);
		t1.sum(15, 10);
		t1.sum("xyz", "abc");
		
	}

}
